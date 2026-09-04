public class PrimeFactors {

    public static void main(String[] args) {

        int number = 60;

        System.out.print("Prime factors: ");

        for (int i = 2; i <= number; i++) {

            while (number % i == 0) {

                System.out.print(i + " ");
                number = number / i;
            }
        }
    }
}
