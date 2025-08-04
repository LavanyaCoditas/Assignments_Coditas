package Assignment3;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


class Sample implements Runnable
{
        private int count = 0;
        private final Lock lock = new ReentrantLock(false);

        public int getCount()
        {
            return count;
        }

        public void increment() {
            count++;
            System.out.println("Count incremented to " + count + " by " + Thread.currentThread().getName());
        }

        @Override
        public void run() {
            lock.lock();
            try {
                for (int i = 0; i < 5; i++) {
                    increment();
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                System.out.println("Exception: " + e.getMessage());
            } finally {
                lock.unlock();
            }
        }
    }

public class ReentrantLock1
{
        public static void main(String[] args) throws InterruptedException {
            Sample sharedSample = new Sample();

            Thread t1 = new Thread(sharedSample, "Thread-1");
            Thread t2 = new Thread(sharedSample, "Thread-2");

            t1.start();
            t2.start();

//            t1.join();
//            t2.join();

            System.out.println("Final count: " + sharedSample.getCount());
        }
    }

