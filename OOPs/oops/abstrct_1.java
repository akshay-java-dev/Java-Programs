abstract class Base {
    Base() {
        System.out.println("I am a constructor of Base class");
    }

    public void sayhello() {
        System.out.println("Hello");
    }

    abstract public void greet();  // Abstract method (must be implemented in child)
}

// Concrete subclass (implements greet)
class Base2 extends Base {
    @Override
    public void greet() {
        System.out.println("Good Morning");
    }
}

// Another abstract class (still abstract, does not implement greet)
abstract class Base3 extends Base {
    public void Th() {
        System.out.println("I am good");
    }
}

// Concrete subclass of Base3 (implements greet)
class Derived extends Base3 {
    @Override
    public void greet() {
        System.out.println("Good Evening");
    }
}

public class abstrct_1 {
    public static void main(String[] args) {
        // Creating object of Base2
        Base2 b = new Base2();
        b.sayhello();
        b.greet();

        System.out.println("----------------");

        // Creating object of Derived (from Base3)
        Derived d = new Derived();
        d.sayhello();
        d.Th();
        d.greet();
    }
}
