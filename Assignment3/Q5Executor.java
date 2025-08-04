package Assignment3;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;



    public class Q5Executor {
        public static void main(String[] args) throws InterruptedException {

            ExecutorService executor = Executors.newFixedThreadPool(3);

            for (int i = 1; i <= 10; i++) {
                int fileNumber = i;

                Runnable task = () -> {
                    System.out.println("Downloading file " + fileNumber + " by " + Thread.currentThread().getName());
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                };
                executor.submit(task);
                //Thread.sleep(1000);
            }
            executor.shutdown();
        }
    }



