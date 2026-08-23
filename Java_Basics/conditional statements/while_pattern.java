public class while_pattern {
    public static void main(String[] args) {
        int n = 5;   // number of rows
        int i = n;

        while (i >= 1) {      // rows decreasing
            int j = 1;
            while (j <= i) {  // print stars in each row
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i--;
        }
    }
}
