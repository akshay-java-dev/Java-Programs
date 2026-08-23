import java.util.Scanner;
public class evenadd {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many even number wants you");
        int n = sc.nextInt();
        int sum = 0;

        for(int i = 0; i<n; i++){
            sum = sum + (2*i);
        }
        System.out.print("Sum of Even numbers:- ");
        System.out.println(sum);
    }
    
}
