class Student {

    String name;

    Student(String name) {
        this.name = name;
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

        return this.name.equals(other.name);
    }
}

public class CompareEqualsAndDoubleEqual {

    public static void main(String[] args) {

        Student s1 = new Student("Akshay");
        Student s2 = new Student("Akshay");

        System.out.println("Using == : " + (s1 == s2));
        System.out.println("Using equals() : " + s1.equals(s2));
    }
}
