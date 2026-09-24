class Student {

    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        return name.hashCode() + age;
    }
}

public class HashCodeExample {

    public static void main(String[] args) {

        Student student = new Student("Akshay", 22);

        System.out.println("Hash Code = "
                + student.hashCode());
    }
}
