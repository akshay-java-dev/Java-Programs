abstract class device {
    device() {
        System.out.println("Collection of device");
    }

    // abstract method
    abstract public void greet();
}

// phone extends device
class phone extends device {
    // constructor (no void keyword)
    phone() {
        System.out.println("This is Phone....");
    }

    @Override
    public void greet() {
        System.out.println("Good Morning");
    }
}

// smartphone extends phone
class smartphone extends phone {
    smartphone() {
        System.out.println("This is a Smartphone");
    }

    public void th() {
        System.out.println("I am good");
    }
}

public class abstract_2 {
    public static void main(String[] args) {
        phone p = new phone();   // calls device() + phone()
        p.greet();

        System.out.println("---------------");

        smartphone s = new smartphone();  // calls device() + phone() + smartphone()
        s.greet();
        s.th();
    }
}
