/***
 * @author Jingning Qian id: 1358068
 */

import java.util.ArrayList;
import java.util.Random;


//two different instances need to be created 1. Mission roster 2. Completed roster
public class Roster{
    //Mission list to store and delete mission details
    private ArrayList<Mission> roster;
    public String rosterType;
    public Roster(String roster_type) {
        this.rosterType = roster_type;
        this.roster = new ArrayList<>();
    }

    public synchronized void addNew(Mission mission) throws InterruptedException {
        while(roster.size() >= 10){
            wait();
        }
        String missonString = mission.toString();
        roster.add(mission);
        System.out.println(missonString + " added to " + rosterType);
    }

    public synchronized void removeComplete() throws InterruptedException {
        while(roster.isEmpty()){
            wait();
        }
        Random rnd = new Random();
        int removedIndex = rnd.nextInt(roster.size());
        Mission mission = roster.get(removedIndex);
        roster.remove(removedIndex);
        System.out.println(mission.toString() + " removed from "+ rosterType);
        }

public synchronized Mission acquireMission() throws InterruptedException {
    while(roster.isEmpty()){
        wait();
    }
    Random rnd =  new Random();
    int acquireMissionIndex = rnd.nextInt(roster.size());
    Mission targetmission = roster.get(acquireMissionIndex);
    roster.remove(acquireMissionIndex);
    notifyAll();

    return targetmission;
}

    public synchronized void releaseMission(Mission targetMission) throws InterruptedException {

        if(targetMission.completed == true) {
            roster.add(targetMission);
            notifyAll();
        }

    }
    }
