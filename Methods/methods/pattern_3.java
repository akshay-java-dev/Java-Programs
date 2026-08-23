public class pattern_3 {
    static void pattern3(int n) {
        for (int i = n; i >= 1; i--) { // start from n and go down to 1
            for (int j = 1; j <= i; j++) { // print stars equal to i
                System.out.print("*");
            }
            System.out.println(); // move to next line
        }
    }

    public static void main(String[] args) {
        pattern3(4);
    }
}
