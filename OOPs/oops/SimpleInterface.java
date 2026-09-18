interface Animal {

    void sound();
}

public class SimpleInterface implements Animal {

    @Override
    public void sound() {
        System.out.println("Dog barks");
    }

    public static void main(String[] args) {

        SimpleInterface dog = new SimpleInterface();

        dog.sound();
    }
}
