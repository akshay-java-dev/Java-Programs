public class UncheckedExceptionExample {

    public static void main(String[] args) {

        try {

            int[] numbers = {10, 20, 30};

            System.out.println(numbers[5]);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println(
                    "Array index is outside the valid range"
            );
        }
    }
}
