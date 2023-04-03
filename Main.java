/**
 * The top-level component of the superheroes simulator.
 *
 * It is responsible for:
 *  - creating all the components of the system;
 *  - starting all of the processes;
 *
 * @author ngeard@unimelb.edu.au
 * @author Jingning Qian id: 1358068
 */

public class Main {

    public static void main(String [] args) throws InterruptedException {

        // generate the mansion and mission rosters
        Roster rosterNew = new Roster("New Roster");
        Roster rosterComplete = new Roster("Complete Roster");
        Mansion mansion = new Mansion("Great Mansion", rosterNew, rosterComplete);

        // generate the producer, consumer and professor Z processes
        Producer producer = new Producer(rosterNew);
        Consumer consumer = new Consumer(rosterComplete);
        ProfessorZ professorZ = new ProfessorZ(mansion);

        // create an array of superheroes
        Superhero[] superheroes = new Superhero[Params.NUM_SUPERHEROES];

        // generate and start the individual superhero processes
        for (int i = 0; i < Params.NUM_SUPERHEROES; i++) {
            superheroes[i] = new Superhero(i + 1, rosterNew, rosterComplete, mansion);
            superheroes[i].start();
        }

        // start the remaining processes
        producer.start();
        consumer.start();
        professorZ.start();

        // join all processes
        for (int i = 0; i < Params.NUM_SUPERHEROES; i++) {
            superheroes[i].join();
        }
        producer.join();
        consumer.join();
        professorZ.join();
    }
}