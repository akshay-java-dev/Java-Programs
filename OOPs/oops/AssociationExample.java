class Teacher {

    String name;

    Teacher(String name) {
        this.name = name;
    }
}

public class AssociationExample {

    String subject;

    AssociationExample(String subject) {
        this.subject = subject;
    }

    void teach(Teacher teacher) {
        System.out.println(
            teacher.name + " teaches " + subject
        );
    }

    public static void main(String[] args) {

        Teacher teacher = new Teacher("Akshay");

        AssociationExample subject =
                new AssociationExample("Java");

        subject.teach(teacher);
    }
}
