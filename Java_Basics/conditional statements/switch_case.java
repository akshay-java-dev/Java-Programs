import java.util.Scanner;
public class switch_case{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of a");
        int a = sc.nextInt();
        System.out.println("Enter the number of b");
        int b = sc.nextInt();
        int choice;
        System.out.println("Enter the choice of numbers from 1 to 4");
        choice = sc.nextInt();
        int add = a+b;
        int sub = a-b;
        int mul = a*b;
        double div = a/b;

        switch(choice){
            case 1:
            System.out.println(add);
            break;

            case 2:
            System.out.println(sub);
            break;

            case 3:
            System.out.println(mul);
            break;

            case 4:
            System.out.println(div);
            break;

            default:
            System.out.println("finish");
        }

    }
}