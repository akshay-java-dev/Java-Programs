public class DigitalRootMethod {

    static int digitalRoot(int number) {
        number = Math.abs(number);

        while (number >= 10) {
            int sum = 0;

            while (number > 0) {
                sum += number % 10;
                number /= 10;
            }

            number = sum;
        }

        return number;
    }

    public static void main(String[] args) {
        System.out.println(digitalRoot(987));
    }
}
