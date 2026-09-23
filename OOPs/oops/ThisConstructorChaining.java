public class ThisConstructorChaining {

    String name;
    int age;

    ThisConstructorChaining() {
        this("Unknown");
    }

    ThisConstructorChaining(String name) {
        this(name, 0);
    }

    ThisConstructorChaining(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        ThisConstructorChaining student =
                new ThisConstructorChaining("Akshay", 22);

        student.display();
    }
}
