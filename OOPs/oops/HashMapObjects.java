import java.util.HashMap;

class Student {

    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class HashMapObjects {

    public static void main(String[] args) {

        HashMap<Integer, Student> students = new HashMap<>();

        students.put(101, new Student("Akshay", 85));
        students.put(102, new Student("Rahul", 78));
        students.put(103, new Student("Amit", 92));

        for (Integer id : students.keySet()) {

            Student student = students.get(id);

            System.out.println(
                    id + " - " +
                    student.name + " - " +
                    student.marks
            );
        }
    }
}
