package Assignment3;
import java.util.concurrent.atomic.AtomicBoolean;
public class RaceSimulation {



        private static final int TOTAL_STEPS = 100;
        private static final AtomicBoolean raceWon = new AtomicBoolean(false);

        static class Runner implements Runnable {
            private final String name;

            Runner(String name) { this.name = name; }

            @Override
            public void run() {
                for (int steps = 1; steps <= TOTAL_STEPS && !raceWon.get(); steps++) {
                    System.out.println(name + ": " + steps);
                    try { Thread.sleep((long) (Math.random() * 50)); }
                    catch (InterruptedException e) { return; }
                    if (steps == TOTAL_STEPS && raceWon.compareAndSet(false, true)) {
                        System.out.println(name + " WINS!");
                    }
                }
            }
        }

        public static void main(String[] args) throws InterruptedException {
            Thread[] runners = {
                    new Thread(new Runner("Runner 1")),
                    new Thread(new Runner("Runner 2")),
                    new Thread(new Runner("Runner 3"))
            };

            System.out.println("Start!");
            for (Thread runner : runners) runner.start();
            for (Thread runner : runners) runner.join();
            System.out.println("Finish!");
        }
    }
}
