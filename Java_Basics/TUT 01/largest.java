import java.util.*;

public class largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a >= b && a >= c) {
            System.out.println("A is Largest");
        }
        else if (b >= a && b >= c) {
            System.out.println("B is Largest");
        }
        else {
            System.out.println("C is Largest");
        }

        sc.close();
    }
}
