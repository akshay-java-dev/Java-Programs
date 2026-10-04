public class CountPositiveNegativeMethod {

    static void countNumbers(int[] arr) {

        int positive = 0;
        int negative = 0;

        for (int num : arr) {

            if (num > 0) {
                positive++;
            } else if (num < 0) {
                negative++;
            }
        }

        System.out.println("Positive = " + positive);
        System.out.println("Negative = " + negative);
    }

    public static void main(String[] args) {

        int[] arr = {10, -5, 20, -8, 15, -2};

        countNumbers(arr);
    }
}
