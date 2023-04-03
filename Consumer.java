/**
 * Consumes completed missions from an roster.
 *
 * @author ngeard@unimelb.edu.au
 * @author Jingning Qian id: 1358068
 *
 */

public class Consumer extends Thread {

    // the roster from which completd missions are removed
    private Roster roster;

    // creates a new consumer for the given roster
    Consumer(Roster newAgenda) {
        this.roster = newAgenda;
    }

    // repeatedly collect completed missions from the roster
    public void run() {
        while (!isInterrupted()) {
            try {
                // remove a mission that is complete randomly
                roster.removeComplete();

                // let some time pass before the next mission is removed
                sleep(Params.MISSION_REMOVAL_TIME);
            }
            catch (InterruptedException e) {
                this.interrupt();
            }
        }
    }
}
