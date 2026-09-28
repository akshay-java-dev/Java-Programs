import java.util.ArrayList;

class BankAccount {
    int accountNo;
    String holderName;
    double balance;

    BankAccount(int accountNo, String holderName, double balance) {
        this.accountNo = accountNo;
        this.holderName = holderName;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void display() {
        System.out.println(accountNo + " " + holderName + " ₹" + balance);
    }
}

public class BankAccountManagement {
    public static void main(String[] args) {

        ArrayList<BankAccount> accounts = new ArrayList<>();

        BankAccount a1 = new BankAccount(1001, "Akshay", 10000);

        a1.deposit(5000);
        a1.withdraw(2000);

        accounts.add(a1);

        for (BankAccount account : accounts) {
            account.display();
        }
    }
}
