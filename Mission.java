/**
 * A mission, with a unique id, to be assigned to a superhero for completion
 * 
 * @author ngeard@unimelb.edu.au
 * @author Jingning Qian id: 1358068
 */

public class Mission {

    // a unique identifier for this mission
    private int id;

    // the next ID to be allocated
    private static int nextId = 1;

    // a flag indicating whether the mission has been completed
    boolean completed;

    // create a new mission with a given identifier
    private Mission(int id) {
        this.id = id;
        this.completed = false;
    }

    // get a new Mission instance with a unique identifier
    public static Mission getNewMission() {
        return new Mission(nextId++);
    }

    // produce an identifying string for the mission
    public String toString() {
        return "Mission " + id;
    }
}