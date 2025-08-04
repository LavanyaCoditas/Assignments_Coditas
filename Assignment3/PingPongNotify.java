package Assignment3;


    class PingPong {
        private final Object lock = new Object();
        private boolean pingTurn = true;

        class Ping extends Thread {

            public void run() {
                for (int i = 0; i < 10; i++) {
                    synchronized (lock) {
                        while (!pingTurn) {
                            try { lock.wait(); } catch (InterruptedException ignored) {}
                        }
                        System.out.println("Ping");
                        pingTurn = false;
                        lock.notify();
                    }
                }
            }
        }

        class Pong extends Thread {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    synchronized (lock) {
                        while (pingTurn) {
                            try { lock.wait(); } catch (InterruptedException ignored) {}
                        }
                        System.out.println("Pong");
                        pingTurn = true;
                        lock.notify();
                    }
                }
            }
        }

        public void startGame() {
            Thread ping = new Ping();
            Thread pong = new Pong();
            ping.start();
            pong.start();
        }
    }

public class PingPongNotify {
    public static void main(String[] args) {
        PingPong game = new PingPong();
        game.startGame();

    }
}
