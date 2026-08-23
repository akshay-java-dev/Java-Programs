import java.util.Scanner;

public class arraylen {
    public static void main(String[] args) {

        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);

        // Taking input
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter value:");
            arr[i] = sc.nextInt();
        }

        // Printing values
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}