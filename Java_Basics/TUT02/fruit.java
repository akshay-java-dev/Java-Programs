import java.util.Scanner;

public class fruit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter fruit name: ");
        String fr = sc.next();

        switch(fr) {
            case "Mango":
                System.out.println("The King of Fruits");
                break;

            case "Apple":
                System.out.println("The Sweet Red Apple");
                break;

            case "Grapes":
                System.out.println("The Sweet Green Grapes");
                break;

            default:
                System.out.println("You haven't selected from cases");
        }

        sc.close();
    }
}