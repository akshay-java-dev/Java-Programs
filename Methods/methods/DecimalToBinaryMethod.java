public class DecimalToBinaryMethod {

    static String toBinary(int n) {
        if (n == 0) {
            return "0";
        }

        String binary = "";

        while (n > 0) {
            binary = (n % 2) + binary;
            n = n / 2;
        }

        return binary;
    }

    public static void main(String[] args) {
        System.out.println(toBinary(25));
    }
}
