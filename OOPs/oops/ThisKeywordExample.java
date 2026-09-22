public class ThisKeywordExample {

    String name;
    int age;

    ThisKeywordExample(String name, int age) {

        this.name = name;
        this.age = age;
    }

    void display() {

        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }

    public static void main(String[] args) {

        ThisKeywordExample student =
                new ThisKeywordExample("Akshay", 22);

        student.display();
    }
}
