class Employee {

    String name;

    Employee(String name) {
        this.name = name;
    }
}

public class DepartmentEmployee {

    String department;
    Employee employee;

    DepartmentEmployee(String department, Employee employee) {
        this.department = department;
        this.employee = employee;
    }

    void display() {

        System.out.println("Department: " + department);
        System.out.println("Employee: " + employee.name);
    }

    public static void main(String[] args) {

        Employee employee =
                new Employee("Akshay");

        DepartmentEmployee department =
                new DepartmentEmployee(
                        "Software Development",
                        employee
                );

        department.display();
    }
}
