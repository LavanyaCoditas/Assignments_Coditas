package Assignment3;
import java.util.concurrent.Semaphore;



    class Tunnel {
        private final Semaphore semaphore;

        public Tunnel(int maxCars) {
            this.semaphore = new Semaphore(maxCars); // allow only 3 cars at once
        }

        public void enterTunnel(String carName) {
            try {
                System.out.println(carName + " is trying to enter the tunnel...");
                semaphore.acquire(); // acquire a permit
                System.out.println(carName + " has entered the tunnel.");
                Thread.sleep(1000);
                System.out.println(carName + " has exited the tunnel.");
            } catch (InterruptedException ignored) {
            } finally {
                semaphore.release(); // release the permit
            }
        }
    }

    class Car extends Thread
    {
        private final Tunnel tunnel;
        private final String carName;

        public Car(Tunnel tunnel, String carName)
        {
            this.tunnel = tunnel;
            this.carName = carName;
        }

        public void run() {
            tunnel.enterTunnel(carName);
        }
    }

    public class CarRaceeSemaphore {
        public static void main(String[] args) {
            Tunnel tunnel = new Tunnel(3);

            for (int i = 1; i <= 10; i++) {
                new Car(tunnel, "Car-" + i).start();
            }
        }
    }
