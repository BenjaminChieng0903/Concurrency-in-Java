/**
 * @author Jingning Qian id: 1358068
 *
 */

public class Mansion {
    private Roster rosterNew;
    private Roster rosterComplete;
    //to check whether professor Z in the mansion
    private boolean isProfessorZInMansion;
    //to control meeting begins or ends
    private boolean meetingBegin;
    //Num of superheroes in the mansion
    private int superheroInMansion;
    //Num of superheroes in the secret room
    private int superheroInRoom;
    public Mansion(String mansion, Roster rosterNew, Roster rosterComplete) {
        this.rosterNew = rosterNew;
        this.rosterComplete = rosterComplete;
        this.meetingBegin = false;
        this.isProfessorZInMansion = false;
        this.superheroInMansion = 0;
        this.superheroInRoom = 0;
    }
    public synchronized String superHeroenterMansion() throws InterruptedException {
        while(isProfessorZInMansion == true){
            wait();
        }
        superheroInMansion++;
        notifyAll();
       return "enter mansion";
    }
    public synchronized String superHeroleaveMansion() throws InterruptedException {
        if((isProfessorZInMansion == true && superheroInMansion != superheroInRoom) || isProfessorZInMansion == false){
            superheroInMansion--;
            notifyAll();
        }
        while(isProfessorZInMansion == true){
            wait();
        }
//        superheroInMansion--;
//        notifyAll();
        return "leave mansion";
    }
    public synchronized String superHeroenterSecretRoom() throws InterruptedException {
//        while(isProfessorZInMansion == true || meetingBegin == false){
//            wait();
//        }
        superheroInRoom++;
        notifyAll();
        return "enter secret room";
    }
    public synchronized String superHeroleaveSecretRoom() throws InterruptedException {
        superheroInRoom--;
        notifyAll();
        return " leave secret room";
    }
    public synchronized void ProfessorEnterRoom() throws InterruptedException {
        isProfessorZInMansion = true;
        notifyAll();
        System.out.println("Professor Z enters Mansion");
    }
    public synchronized void ProfessorLeaveRoom(){
        isProfessorZInMansion = false;
        notifyAll();
        System.out.println("Professor Z leaves Mansion");
    }
    public synchronized void meetingBegin() throws InterruptedException {
        while(superheroInMansion != superheroInRoom){
            wait();
        }
        meetingBegin = true;
        notifyAll();
        System.out.println("meeting begins!");
    }
    public synchronized void meetingEnds() throws InterruptedException {
        while(superheroInRoom != 0){
            wait();
        }
        meetingBegin = false;
        notifyAll();
        System.out.println("meeting ends!");
    }
    public synchronized void superheroWaitingInRoom() throws InterruptedException {
        while(meetingBegin == false){
            wait();
        }
    }
}
