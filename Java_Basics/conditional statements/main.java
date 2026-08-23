import java.util.Scanner;
public class main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the boolean value a");
        boolean a = sc.nextBoolean();
        System.out.println("Enter the boolean value of b");
        boolean b = sc.nextBoolean();
        System.out.println("Enter the boolean value of c");
        boolean c = sc.nextBoolean();

        if (a && b && c){
            System.out.println("yes");
        }
        else{
            System.out.println("No");
        }

    }
}