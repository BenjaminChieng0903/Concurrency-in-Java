/**
 * Produces new quests for the knights to complete.
 *
 * @author ngeard@unimelb.edu.au
 * @author Jingning Qian id: 1358068
 */

public class Producer extends Thread {

	private Roster roster;
	
    // create a new producer
    Producer(Roster newAgenda) {
        this.roster = newAgenda;
    }

    // quests 
    public void run() {
        while(!isInterrupted()) {
            try {
                // create a new mission and send it to the roster.
                Mission mission = Mission.getNewMission();
                roster.addNew(mission);

                // let some time pass before the next mission arrives
                sleep(Params.MISSION_ADDITION_TIME);
            } catch (InterruptedException e) {
                this.interrupt();
            }
        }
    }
}