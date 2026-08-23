import java.util.Scanner;

public class per {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total marks");
          int total = sc.nextInt();

        System.out.println("Enter the marks of Math:");
        int Math = sc.nextInt();

        System.out.println("Enter the marks of Science:");
        int Science = sc.nextInt();

        System.out.println("Enter the marks of Physics:");
        int Physics = sc.nextInt();

        System.out.println("Enter the marks of Biology:");
        int Biology = sc.nextInt();

        int obtainedMarks = Math + Science + Physics + Biology;
        int percentage = (obtainedMarks * 100) / total;

        System.out.println("Percentage: " + percentage + "%");

        sc.close();
    }
}
