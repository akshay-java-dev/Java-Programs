public class IsStrongNumberMethod {

    static int factorial(int n) {
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }

    static boolean isStrong(int n) {
        if (n < 0) {
            return false;
        }

        int original = n;
        int sum = 0;

        do {
            int digit = n % 10;
            sum += factorial(digit);
            n /= 10;
        } while (n != 0);

        return sum == original;
    }

    public static void main(String[] args) {
        System.out.println(isStrong(145));
    }
}
