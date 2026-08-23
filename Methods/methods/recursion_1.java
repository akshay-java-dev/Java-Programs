import java.util.Scanner;
public class recursion_1 {
        // factorial(0) = 1
        // factorial(n) = n * n-1 *...1
        // factorial(5) = 5*4*3*2*1 = 120
        // factorial(n) n*factorial(n-1)
        static int factorial (int n){
            if(n == 0 || n == 1){
                return 1;
            }else{
                return n*factorial(n-1);
            }

    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N");
        int n = sc.nextInt();
        System.out.println("the value of factorial n is :-" +factorial(n));
        

    }
    
}
