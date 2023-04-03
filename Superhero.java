/**
 * @author Jingning Qian id: 1358068
 * */

public class Superhero extends Thread{
    private  int index;
    private  Roster newRoster;
    private  Roster rosterComplete;
    private  Mansion mansion;
    private Mission targetMission;
    public Superhero(int i, Roster rosterNew, Roster rosterComplete, Mansion mansion) {
        this.index = i;
        this.newRoster = rosterNew;
        this.rosterComplete = rosterComplete;
        this.mansion = mansion;
    }

    @Override
    public void run() {
        //enter mansion and secret room
        try {

            while(true) {
                //superheroes enter the mansion
                System.out.println("superhero " + index + " " + mansion.superHeroenterMansion());
                //superheroes discuss the world affairs
                sleep(Params.getDiscussionTime());
                System.out.println("superhero " + index + " " + mansion.superHeroenterSecretRoom());
                //waiting for meeting begin(depends on professor Z thread)
                mansion.superheroWaitingInRoom();

                //superheroes acquire or release the mission
                if(targetMission != null && targetMission.completed == true){
                    rosterComplete.releaseMission(targetMission);
                    String missionDetails = targetMission.toString();
                    System.out.println("superhero " + index + " release " + missionDetails);
                }

                targetMission = newRoster.acquireMission();
                String missionDetails = targetMission.toString();
                System.out.println("superhero " + index + " acquire "+ missionDetails);

                //waiting meeting ends(depends on professor Z thread)


                //superheroes leave the secret room
                System.out.println("superhero " + index + " " + mansion.superHeroleaveSecretRoom());
                //superheroes discuss the world affairs
                sleep(Params.getDiscussionTime());
                System.out.println("superhero " + index + " " + mansion.superHeroleaveMansion());

                // complete the mission
                targetMission.completed = true;
                 sleep(Params.getMissionTime());
                System.out.println("superhero "+ index + " complete " + missionDetails);


            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
