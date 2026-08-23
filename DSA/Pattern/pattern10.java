public class pattern10 {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n) {

        for (int row = 1; row <= n; row++) {

            // Print leading spaces
            for (int space = 1; space < row; space++) {
                System.out.print(" ");
            }

            // Print stars
            for (int col = row; col <= n; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}