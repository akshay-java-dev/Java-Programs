
import java.util.concurrent.locks.ReentrantLock;

class Bank {
    private int balance = 10000;

    private final ReentrantLock lock =
            new ReentrantLock();

    public void withdraw(int amount) {
        lock.lock();

        try {
            if (balance >= amount) {
                balance -= amount;

                System.out.println(
                    Thread.currentThread().getName()
                    + " withdrew " + amount
                );
            } else {
                System.out.println("Insufficient balance");
            }
        } finally {
            lock.unlock();
        }
    }

    public int getBalance() {
        lock.lock();
        try {
            return balance;
        } finally {
            lock.unlock();
        }
    }
}

public class ConcurrentBankingExample {
    public static void main(String[] args)
            throws InterruptedException {

        Bank bank = new Bank();

        Thread t1 = new Thread(
            () -> bank.withdraw(3000), "User 1"
        );

        Thread t2 = new Thread(
            () -> bank.withdraw(4000), "User 2"
        );

        Thread t3 = new Thread(
            () -> bank.withdraw(5000), "User 3"
        );

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println(
            "Final Balance: " + bank.getBalance()
        );
    }
}
