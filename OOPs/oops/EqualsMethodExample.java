class Student {

    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Student)) {
            return false;
        }

        Student other = (Student) obj;

        return this.name.equals(other.name)
                && this.age == other.age;
    }
}

public class EqualsMethodExample {

    public static void main(String[] args) {

        Student s1 = new Student("Akshay", 22);
        Student s2 = new Student("Akshay", 22);

        System.out.println(s1.equals(s2));
    }
}
