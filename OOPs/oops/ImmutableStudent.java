public final class ImmutableStudent {

    private final String name;
    private final int age;

    public ImmutableStudent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {

        ImmutableStudent student =
                new ImmutableStudent("Akshay", 22);

        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
    }
}
