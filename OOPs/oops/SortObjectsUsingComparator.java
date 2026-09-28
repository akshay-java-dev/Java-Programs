import java.util.ArrayList;
import java.util.Comparator;

class Employee {

    String name;
    int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println(name + " - " + salary);
    }
}

public class SortObjectsUsingComparator {

    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Akshay", 50000));
        employees.add(new Employee("Rahul", 35000));
        employees.add(new Employee("Amit", 70000));

        employees.sort(
                Comparator.comparingInt(e -> e.salary)
        );

        for (Employee employee : employees) {
            employee.display();
        }
    }
}
