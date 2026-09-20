public class EmployeeEncapsulation {

    private int employeeId;
    private String name;
    private double salary;

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSalary(double salary) {

        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary cannot be negative");
        }
    }

    public double getSalary() {
        return salary;
    }

    public static void main(String[] args) {

        EmployeeEncapsulation employee =
                new EmployeeEncapsulation();

        employee.setEmployeeId(101);
        employee.setName("Akshay");
        employee.setSalary(50000);

        System.out.println("Employee ID: "
                + employee.getEmployeeId());

        System.out.println("Name: "
                + employee.getName());

        System.out.println("Salary: "
                + employee.getSalary());
    }
}
