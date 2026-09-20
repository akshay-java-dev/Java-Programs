public class EncapsulationStudent {

    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {

        EncapsulationStudent student =
                new EncapsulationStudent();

        student.setName("Akshay");
        student.setAge(22);

        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
    }
}
