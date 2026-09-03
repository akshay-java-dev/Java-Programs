public class DecimalToBinary {

    public static void main(String[] args) {

        int number = 45;
        int binary = 0;
        int place = 1;

        while (number > 0) {

            int remainder = number % 2;

            binary = binary + remainder * place;

            place = place * 10;
            number = number / 2;
        }

        System.out.println("Binary: " + binary);
    }
}
