package Assignment3;

import java.util.Scanner;

public class BankAccount implements Runnable
{
    private static double amt ;
    private static double addAmt;
    private double balance = 10000;
    public  synchronized void credit(double amt)
    {
        if(amt >0)
        {
            try
            {
                System.out.println(Thread.currentThread().getName()+" : trying to add some amount :"+amt);
                balance+=amt;
                System.out.println(Thread.currentThread().getName()+" Amount credited succesfully: "+balance);
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                System.out.println("interrupt");
            }
        }
        else {
            System.out.println("invalid amount entered:");
        }
    }
    public synchronized void withdraw(double amt)
    {
        if (balance >= amt)
        {
            try
            {
                System.out.println(Thread.currentThread().getName() + " is attempting to withdraw " + amt);
                balance -= amt;
                System.out.println(Thread.currentThread().getName() + ": withdrawal successful, new balance: " + balance);
                Thread.sleep(500); // Simulate processing time
            }
            catch (InterruptedException e)
            {
                System.out.println(Thread.currentThread().getName() + ": interrupted during withdrawal - " + e);
            }
        }
        else
        {
            System.out.println(Thread.currentThread().getName() + ": insufficient balance (" + balance + ") for withdrawal of " + amt);
        }
    }

    @Override
    public void run() {
        // Each thread attempts to withdraw a specific amount
        withdraw(amt); // Example: each thread tries to withdraw 5000
        credit(addAmt);
    }

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter amount to be withdraw");
        amt =sc.nextDouble();
        System.out.println("enter amount you want to credit");
        addAmt=sc.nextDouble();
        BankAccount account = new BankAccount(); // Single shared account
        Thread t1 = new Thread(account, "bank1");
        Thread t2 = new Thread(account, "bank2");
        t1.start();
        t2.start();

        // Wait for threads to finish
        try
        {
            t1.join();
            t2.join();
        } catch (InterruptedException e)
        {
            System.out.println("Main thread interrupted: " + e);
        }
        System.out.println("Final balance: " + account.balance);
    }
}