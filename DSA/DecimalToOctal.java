public class DecimalToOctal {

    public static void main(String[] args) {

        int number = 83;
        int octal = 0;
        int place = 1;

        while (number > 0) {

            int remainder = number % 8;

            octal = octal + remainder * place;

            place = place * 10;
            number = number / 8;
        }

        System.out.println("Octal: " + octal);
    }
}
