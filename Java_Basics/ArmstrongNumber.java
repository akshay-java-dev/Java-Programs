
public class ArmstrongNumber {
    public static void main(String[] args) {
        int number = 153;
        int original = number;
        int sum = 0;

        int digits = String.valueOf(number).length();

        while (number > 0) {
            int digit = number % 10;
            sum += (int) Math.pow(digit, digits);
            number /= 10;
        }

        if (sum == original) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }
    }
}
