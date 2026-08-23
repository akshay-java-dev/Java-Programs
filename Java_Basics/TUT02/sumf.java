import java.util.Scanner;
public class sumf {
    public static void main(String [] args){
        //sumf();
        int result  = sum1(10,30);
        System.out.println("The Result is  :- " +result);
    }
    static int sum1(int a , int b){
        int c = a + b;
        return c;
    }
   static void sumf(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Num1 : -");
        int num1 = sc.nextInt();
        System.out.println("Enter the Num2 : -");
        int num2 = sc.nextInt();

        int sum = num1 + num2 ;
        System.out.println("The Sum : - " + sum);
    }
    
}
