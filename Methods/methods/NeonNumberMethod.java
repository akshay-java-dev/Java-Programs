public class NeonNumberMethod {

    static boolean isNeon(int number) {
        if (number < 0) {
            return false;
        }

        long square = (long) number * number;
        int sum = 0;

        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }

        return sum == number;
    }

    public static void main(String[] args) {
        int number = 9;

        System.out.println(isNeon(number));
    }
}
