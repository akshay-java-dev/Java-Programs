public class IsHarshadNumberMethod {

    static boolean isHarshad(int n) {
        if (n <= 0) {
            return false;
        }

        int original = n;
        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        return original % sum == 0;
    }

    public static void main(String[] args) {
        System.out.println(isHarshad(18));
        System.out.println(isHarshad(19));
    }
}
