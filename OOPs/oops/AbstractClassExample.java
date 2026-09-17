abstract class Animal {

    abstract void sound();

    void eat() {
        System.out.println("Animal is eating");
    }
}

public class AbstractClassExample extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }

    public static void main(String[] args) {

        AbstractClassExample dog =
                new AbstractClassExample();

        dog.sound();
        dog.eat();
    }
}
