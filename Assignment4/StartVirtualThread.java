package Assignment4;

public class StartVirtualThread implements Runnable {

    @Override
    public void run() {
        System.out.println("Virtual Thread started. \n" + Thread.currentThread());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Virtual thread finished...");
    }

    public static void main(String[] args) {

        StartVirtualThread task = new StartVirtualThread();
        for (int i = 0; i < 5; i++) {


            Thread thread = Thread.ofVirtual().start(task);

            try {
                thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


