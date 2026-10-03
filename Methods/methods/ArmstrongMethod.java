public class ArmstrongMethod {

    static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;
        int digits = String.valueOf(n).length();

        while (n != 0) {
            int digit = n % 10;
            sum += Math.pow(digit, digits);
            n = n / 10;
        }

        return sum == original;
    }

    public static void main(String[] args) {
        if (isArmstrong(153)) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong Number");
        }
    }
}
