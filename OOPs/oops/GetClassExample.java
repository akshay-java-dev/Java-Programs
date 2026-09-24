class Employee {

    String name;

    Employee(String name) {
        this.name = name;
    }
}

public class GetClassExample {

    public static void main(String[] args) {

        Employee employee =
                new Employee("Akshay");

        Class<?> className = employee.getClass();

        System.out.println("Class Name = "
                + className.getName());

        System.out.println("Simple Name = "
                + className.getSimpleName());
    }
}
