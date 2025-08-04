package Assignment3;
import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Account {
    private final int accountId;
    private double balance;
    public final Lock lock;

    public Account(int accountId, double balance) {
        this.accountId = accountId;
        this.balance = balance;
        this.lock = new ReentrantLock();
    }

    public int getAccountId() {
        return accountId;
    }

    public double getBalance() {
        return balance;
    }

    public boolean withdraw(double amount) {
        lock.lock();
        try {
            if (balance >= amount) {
                balance -= amount;
                return true;
            }
            return false;
        } finally {
            lock.unlock();
        }
    }

    public void deposit(double amount) {
        lock.lock();
        try {
            balance += amount;
        } finally {
            lock.unlock();
        }
    }
}

class TransferTask implements Runnable {
    private final Account fromAccount;
    private final Account toAccount;
    private final double amount;

    public TransferTask(Account fromAccount, Account toAccount, double amount) {
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.amount = amount;
    }

    private void transferMoney(Account from, Account to, double amount) {
        Lock firstLock = from.getAccountId() < to.getAccountId() ? from.lock : to.lock;
        Lock secondLock = from.getAccountId() < to.getAccountId() ? to.lock : from.lock;

        firstLock.lock();
        try {
            secondLock.lock();
            try {
                if (from.withdraw(amount)) {
                    to.deposit(amount);
                    System.out.printf("Transferred $%.2f from Account %d to Account %d%n",
                            amount, from.getAccountId(), to.getAccountId());
                    System.out.printf("Account %d balance: $%.2f%n", from.getAccountId(), from.getBalance());
                    System.out.printf("Account %d balance: $%.2f%n", to.getAccountId(), to.getBalance());
                } else {
                    System.out.printf("Transfer of $%.2f from Account %d to Account %d failed: Insufficient funds%n",
                            amount, from.getAccountId(), to.getAccountId());
                }
            } finally {
                secondLock.unlock();
            }
        } finally {
            firstLock.unlock();
        }
    }

    @Override
    public void run() {
        transferMoney(fromAccount, toAccount, amount);
    }
}

public class AccountTransfer {
    public static void main(String[] args) {
        Account account1 = new Account(1, 1000.0);
        Account account2 = new Account(2, 1000.0);
        Random random = new Random();

        Thread[] threads = new Thread[5];
        for (int i = 0; i < threads.length; i++) {
            double amount = 100 + random.nextDouble() * 400; // Random amount between 100 and 500
            if (random.nextBoolean()) {
                threads[i] = new Thread(new TransferTask(account1, account2, amount));
            } else {
                threads[i] = new Thread(new TransferTask(account2, account1, amount));
            }
        }

        for (Thread thread : threads) {
            thread.start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }

        System.out.println("\nFinal balances:");
        System.out.printf("Account %d: $%.2f%n", account1.getAccountId(), account1.getBalance());
        System.out.printf("Account %d: $%.2f%n", account2.getAccountId(), account2.getBalance());
    }
}