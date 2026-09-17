abstract class Bank {

    abstract void interestRate();

    void bankName() {
        System.out.println("Banking System");
    }
}

public class AbstractBank extends Bank {

    @Override
    void interestRate() {
        System.out.println("Interest Rate = 7%");
    }

    public static void main(String[] args) {

        AbstractBank bank =
                new AbstractBank();

        bank.bankName();
        bank.interestRate();
    }
}
