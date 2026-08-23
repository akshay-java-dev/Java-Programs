import java.util.Scanner;

public class nestedswitch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int empid = sc.nextInt();

        System.out.print("Enter Department Code (1=CSE, 2=IT): ");
        int department = sc.nextInt();

        switch(empid) {

            case 1:
                System.out.println("Employee Code: 122");

                switch(department) {
                    case 1:
                        System.out.println("Department: CSE");
                        break;

                    case 2:
                        System.out.println("Department: IT");
                        break;

                    default:
                        System.out.println("Invalid Department");
                }
                break;

            case 2:
                System.out.println("Employee Code: 2424");
                break;

            default:
                System.out.println("Invalid Employee ID");
        }

        sc.close();
    }
}