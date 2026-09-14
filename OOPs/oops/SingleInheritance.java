class Animal {

    void eat() {
        System.out.println("Animal is eating");
    }
}

public class SingleInheritance extends Animal {

    void sleep() {
        System.out.println("Animal is sleeping");
    }

    public static void main(String[] args) {

        SingleInheritance obj = new SingleInheritance();

        obj.eat();
        obj.sleep();
    }
}
