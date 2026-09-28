import java.util.ArrayList;

class Student {

    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println(name + " - " + age);
    }
}

public class ArrayListObjects {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Akshay", 22));
        students.add(new Student("Rahul", 21));
        students.add(new Student("Amit", 23));

        for (Student student : students) {
            student.display();
        }
    }
}
