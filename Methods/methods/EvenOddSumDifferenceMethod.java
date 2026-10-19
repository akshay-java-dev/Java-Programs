public class EvenOddSumDifferenceMethod {

    static int calculateDifference(int[] arr) {
        int evenSum = 0;
        int oddSum = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
        }

        return evenSum - oddSum;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6};

        System.out.println(calculateDifference(arr));
    }
}
