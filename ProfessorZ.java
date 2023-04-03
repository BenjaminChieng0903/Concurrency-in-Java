/**
 * @author Jingning Qian id: 1358068
 * */
public class ProfessorZ extends Thread{
    private Mansion mansion;
    public ProfessorZ(Mansion mansion) {
        this.mansion = mansion;
    }

    @Override
    public void run() {
        try {
            while(true) {
                sleep(Params.MEAN_PROF_WAITING_TIME);
                mansion.ProfessorEnterRoom();
                sleep(400);
                mansion.meetingBegin();
                mansion.meetingEnds();
                mansion.ProfessorLeaveRoom();
                sleep(Params.MEAN_DISCUSSION_TIME);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
