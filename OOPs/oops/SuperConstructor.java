class Person {

    String name;

    Person(String name) {
        this.name = name;
        System.out.println("Person Constructor");
    }
}

public class SuperConstructor extends Person {

    int age;

    SuperConstructor(String name, int age) {

        super(name);

        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        SuperConstructor student =
                new SuperConstructor("Akshay", 22);

        student.display();
    }
}
