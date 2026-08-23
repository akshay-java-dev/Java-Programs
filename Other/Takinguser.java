import java.util.Scanner;
public class Takinguser{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Taking userinput");
        System.out.println("Enter the number 1");
        int a = sc.nextInt();
        System.out.println("Enter the number 2");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println(sum);
    

    }
}