public class GCD {

    static int findGCD(int a, int b) {

        while (b != 0) {

            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    public static void main(String[] args) {

        int a = 48;
        int b = 18;

        System.out.println("GCD: " + findGCD(a, b));
    }
}
