import java.util.Scanner;
public class while_loop2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();

        while(a<=10){
            System.out.println(a);
            a++;
        }
    }
    
}
