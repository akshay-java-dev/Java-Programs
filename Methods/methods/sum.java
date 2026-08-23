import java.util.Scanner;
public class sum {
    int mysum(int a, int b){
        int c = a + b;
        return c;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  value of x");
        int x = sc.nextInt();
        System.out.println("Enter the value of y");
        int y = sc.nextInt();

        sum s = new sum();
        int result = s.mysum(x,y);
        System.out.println("Sum of Two Numbers "+result);
    }
    
}
