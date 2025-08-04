package Assignment3;


    import java.util.concurrent.CountDownLatch;

    class Runner implements Runnable {
        private String runnerName;
        private CountDownLatch waitForPrevious;
        private CountDownLatch signalNext;

        public Runner(String runnerName, CountDownLatch waitForPrevious, CountDownLatch signalNext) {
            this.runnerName = runnerName;
            this.waitForPrevious = waitForPrevious;
            this.signalNext = signalNext;
        }

        public void run() {
            try {
                // Wait for the previous runner to finish
                if (waitForPrevious != null) {
                    waitForPrevious.await();
                }
                // Simulate running by sleeping for 1-2 seconds
                System.out.println(runnerName + " started running!");
                Thread.sleep(1000 + (int)(Math.random() * 1000));
                System.out.println(runnerName + " finished running!");
                // Signal the next runner to start
                if (signalNext != null) {
                    signalNext.countDown();
                }
            } catch (InterruptedException e) {
                System.out.println(runnerName + " was interrupted!");
            }
        }
    }

    public class RelayRace {
        public static void main(String[] args) {
            // Create latches to control runner sequence
            CountDownLatch latch1 = new CountDownLatch(1);
            CountDownLatch latch2 = new CountDownLatch(1);
            CountDownLatch latch3 = new CountDownLatch(1);
            CountDownLatch latch4 = new CountDownLatch(1);

            // Create 4 runners
            Thread runner1 = new Thread(new Runner("Runner 1", null, latch1));
            Thread runner2 = new Thread(new Runner("Runner 2", latch1, latch2));
            Thread runner3 = new Thread(new Runner("Runner 3", latch2, latch3));
            Thread runner4 = new Thread(new Runner("Runner 4", latch3, latch4));

            // Start all runners
            runner1.start();
            runner2.start();
            runner3.start();
            runner4.start();

            // Wait for the last runner to finish
            try {
                latch4.await();
                System.out.println("Race finished!");
            } catch (InterruptedException e) {
                System.out.println("Race was interrupted!");
            }
        }
    }

