import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the employee salary:");
        int salary = sc.nextInt();

        if (salary >= 30000) {
            salary = salary + 3000;
            System.out.println("You have got 30% bonus");
        } 
        else if (salary >= 20000) {
            salary = salary + 2000;
            System.out.println("You have got 20% bonus");
        } 
        else if (salary >= 10000) {
            salary = salary + 1000;
            System.out.println("You have got 10% bonus");
        } 
        else {
            System.out.println("No bonus");
        }

        System.out.println("Final Salary: " + salary);
        sc.close();
    }
}
