public class pattern7 {

    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n) {

        for (int row = 1; row < 2 * n; row++) {

            int totalCol = row > n ? 2 * n - row : row;

            for (int col = 1; col <= totalCol; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}