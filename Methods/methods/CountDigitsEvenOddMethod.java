public class CountDigitsEvenOddMethod {

    static void countDigits(int n) {

        int even = 0;
        int odd = 0;

        while (n != 0) {

            int digit = n % 10;

            if (digit % 2 == 0) {
                even++;
            } else {
                odd++;
            }

            n = n / 10;
        }

        System.out.println("Even digits = " + even);
        System.out.println("Odd digits = " + odd);
    }

    public static void main(String[] args) {

        countDigits(123456);
    }
}
