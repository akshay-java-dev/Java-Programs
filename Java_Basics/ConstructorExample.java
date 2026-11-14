
class Employee {
    String name;
    int salary;

    Employee(String n, int s) {
        name = n;
        salary = s;
    }

    void display() {
        System.out.println("Employee: " + name);
        System.out.println("Salary: " + salary);
    }
}

public class ConstructorExample {
    public static void main(String[] args) {
        Employee e1 = new Employee("Rahul", 25000);
        Employee e2 = new Employee("Amit", 30000);

        e1.display();
        e2.display();
    }
}
