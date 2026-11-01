
class BankAccount {
    private int balance = 1000;

    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println(
            Thread.currentThread().getName()
            + " deposited: " + amount
            + " | Balance: " + balance
        );
    }

    public synchronized int getBalance() {
        return balance;
    }
}

public class BankingSynchronizationExample {
    public static void main(String[] args)
            throws InterruptedException {

        BankAccount account = new BankAccount();

        Thread t1 = new Thread(
            () -> account.deposit(500), "User 1"
        );

        Thread t2 = new Thread(
            () -> account.deposit(1000), "User 2"
        );

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(
            "Final Balance: " + account.getBalance()
        );
    }
}
