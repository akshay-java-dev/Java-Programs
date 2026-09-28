import java.util.ArrayList;

class Student {
    int id;
    String name;
    int marks;

    Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println(id + " " + name + " " + marks);
    }
}

public class StudentManagement {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(1, "Akshay", 85));
        students.add(new Student(2, "Rahul", 78));
        students.add(new Student(3, "Amit", 92));

        for (Student s : students) {
            s.display();
        }
    }
}
