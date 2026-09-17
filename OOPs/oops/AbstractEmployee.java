abstract class Employee {

    String name;

    Employee(String name) {
        this.name = name;
    }

    abstract void work();

    void displayName() {
        System.out.println("Employee Name = " + name);
    }
}

public class AbstractEmployee extends Employee {

    AbstractEmployee(String name) {
        super(name);
    }

    @Override
    void work() {
        System.out.println(name + " is working as a developer");
    }

    public static void main(String[] args) {

        AbstractEmployee employee =
                new AbstractEmployee("Akshay");

        employee.displayName();
        employee.work();
    }
}
