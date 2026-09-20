public class BankAccountEncapsulation {

    private double balance;

    public void deposit(double amount) {

        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Amount Deposited: " + amount);
        } else {
            System.out.println("Invalid Amount");
        }
    }

    public void withdraw(double amount) {

        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Amount Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {

        BankAccountEncapsulation account =
                new BankAccountEncapsulation();

        account.deposit(10000);
        account.withdraw(2500);

        System.out.println("Current Balance: "
                + account.getBalance());
    }
}
