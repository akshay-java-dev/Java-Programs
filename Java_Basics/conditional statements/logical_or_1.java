import java.util.Scanner;
public class logical_or_1{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of boolean A");
        boolean a = sc.nextBoolean();
        System.out.println("Enter the value of Boolean B");
        boolean b = sc.nextBoolean();

        if(a || b){
            System.out.println("yes");
        }else{
            System.out.println("No");
        }
    }
}