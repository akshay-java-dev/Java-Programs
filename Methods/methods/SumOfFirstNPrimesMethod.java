public class SumOfFirstNPrimesMethod {

    static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i <= number / i; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    static int sumOfFirstNPrimes(int n) {
        int count = 0;
        int number = 2;
        int sum = 0;

        while (count < n) {
            if (isPrime(number)) {
                sum += number;
                count++;
            }
            number++;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfFirstNPrimes(5));
    }
}
