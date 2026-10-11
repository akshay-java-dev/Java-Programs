public class SumOfOddNumbersMethod {

    static int sumOdd(int[] arr) {
        int sum = 0;

        for (int num : arr) {
            if (num % 2 != 0) {
                sum += num;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        System.out.println(sumOdd(arr));
    }
}
