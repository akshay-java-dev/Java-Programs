public class SumOfEvenNumbersMethod {

    static int sumEven(int[] arr) {
        int sum = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                sum += num;
            }
        }

        return sum;
    }

    public static void main(String[] args) {

        int[] arr = {10, 15, 20, 7, 30};

        System.out.println("Sum of Even Numbers = " + sumEven(arr));
    }
}
