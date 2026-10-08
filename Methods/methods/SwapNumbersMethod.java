public class SwapNumbersMethod {

    static void swap(int[] numbers) {

        int temp = numbers[0];
        numbers[0] = numbers[1];
        numbers[1] = temp;
    }

    public static void main(String[] args) {

        int[] numbers = {10, 20};

        System.out.println("Before: " + numbers[0] + " " + numbers[1]);

        swap(numbers);

        System.out.println("After: " + numbers[0] + " " + numbers[1]);
    }
}
