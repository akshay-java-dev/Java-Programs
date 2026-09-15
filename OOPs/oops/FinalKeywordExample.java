class Employee {

    final int salary = 30000;

    final void displaySalary() {
        System.out.println("Salary = " + salary);
    }
}

public class FinalKeywordExample extends Employee {

    void displayName() {
        System.out.println("Employee Name = Akshay");
    }

    public static void main(String[] args) {

        FinalKeywordExample obj =
                new FinalKeywordExample();

        obj.displaySalary();
        obj.displayName();
    }
}
