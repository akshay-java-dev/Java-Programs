class Student {

    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + "}";
    }
}

public class ToStringExample {

    public static void main(String[] args) {

        Student student = new Student("Akshay", 22);

        System.out.println(student);
    }
}
