public class pattern8 {

    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n) {

        for (int row = 0; row < 2 * n; row++) {

            int totalCol = row > n ? 2 * n - row : row;
            int totalSpaces = n - totalCol;

            // Print spaces
            for (int s = 0; s <= totalSpaces; s++) {
                System.out.print("  ");
            }

            // Print stars
            for (int col = 0; col <= totalCol; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}