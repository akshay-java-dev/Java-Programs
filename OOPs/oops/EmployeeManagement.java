import java.util.ArrayList;

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println(id + " " + name + " " + salary);
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee(101, "John", 30000));
        employees.add(new Employee(102, "David", 40000));
        employees.add(new Employee(103, "Alex", 35000));

        for (Employee e : employees) {
            e.display();
        }
    }
}
