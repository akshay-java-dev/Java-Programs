public class InnerClassExample {

    private String name = "Akshay";

    class Student {

        void display() {
            System.out.println("Student Name: " + name);
        }
    }

    public static void main(String[] args) {

        InnerClassExample obj =
                new InnerClassExample();

        InnerClassExample.Student student =
                obj.new Student();

        student.display();
    }
}
