import java.util.Scanner;
public class fibonacci_2 {
    static void  fibo(int n ){
        int first = 0;
        int second  = 1;
        for(int i = 0 ; i<=n; i++){
         System.out.println(" "+first);
         int next = first + second;
         first = second;
         second = next;
        }
    }
    public static void  main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of n");
        int x = sc.nextInt();
        fibo(x);
    }
    
}
