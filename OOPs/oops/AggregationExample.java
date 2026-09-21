import java.util.ArrayList;

class Student {

    String name;

    Student(String name) {
        this.name = name;
    }
}

public class AggregationExample {

    ArrayList<Student> students;

    AggregationExample(ArrayList<Student> students) {
        this.students = students;
    }

    void displayStudents() {

        for (Student student : students) {
            System.out.println(student.name);
        }
    }

    public static void main(String[] args) {

        Student s1 = new Student("Akshay");
        Student s2 = new Student("Rahul");

        ArrayList<Student> list = new ArrayList<>();

        list.add(s1);
        list.add(s2);

        AggregationExample college =
                new AggregationExample(list);

        college.displayStudents();
    }
}
