import java.util.Scanner;

public class condition_1 {
    int mycondition(int a, int b) {
        int c;
        if (a > b) {
            c = a * b;
        } else {
            c = a + b;
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the firt number");
        int num1 = sc.nextInt();
        System.out.println("Enter the second Number");
        int num2 = sc.nextInt();

        condition_1 c = new condition_1();
        int myresult = c.mycondition(num1, num2);
        System.out.println("The Conditon result is :-" + myresult);
    }
}