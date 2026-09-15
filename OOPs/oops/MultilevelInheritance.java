lass Animal {

    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("Dog barks");
    }
}

public class MultilevelInheritance extends Dog {

    void run() {
        System.out.println("Dog runs");
    }

    public static void main(String[] args) {

        MultilevelInheritance obj = new MultilevelInheritance();

        obj.eat();
        obj.bark();
        obj.run();
    }
}
