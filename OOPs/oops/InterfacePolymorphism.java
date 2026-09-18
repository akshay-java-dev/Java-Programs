interface Payment {

    void pay();
}

class UPI implements Payment {

    @Override
    public void pay() {
        System.out.println("Payment using UPI");
    }
}

class CreditCard implements Payment {

    @Override
    public void pay() {
        System.out.println("Payment using Credit Card");
    }
}

public class InterfacePolymorphism {

    public static void main(String[] args) {

        Payment payment;

        payment = new UPI();
        payment.pay();

        payment = new CreditCard();
        payment.pay();
    }
}
