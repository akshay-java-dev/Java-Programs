class Animal {

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

public class MethodOverridingExample2 extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }

    public static void main(String[] args) {

        MethodOverridingExample2 obj =
                new MethodOverridingExample2();

        obj.sound();
    }
}
