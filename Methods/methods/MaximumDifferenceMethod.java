public class MaximumDifferenceMethod {

    static int maxDifference(int[] arr) {
        if (arr.length < 2) {
            throw new IllegalArgumentException(
                "Array must contain at least two elements"
            );
        }

        int minSoFar = arr[0];
        int maxDiff = arr[1] - arr[0];

        for (int i = 1; i < arr.length; i++) {
            maxDiff = Math.max(maxDiff, arr[i] - minSoFar);
            minSoFar = Math.min(minSoFar, arr[i]);
        }

        return maxDiff;
    }

    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 3, 6, 4};
        System.out.println(maxDifference(arr));
    }
}
