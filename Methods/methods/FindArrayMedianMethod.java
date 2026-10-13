import java.util.Arrays;

public class FindArrayMedianMethod {

    static double findMedian(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }

        int[] sorted = arr.clone();
        Arrays.sort(sorted);

        int mid = sorted.length / 2;

        if (sorted.length % 2 == 1) {
            return sorted[mid];
        }

        return ((long) sorted[mid - 1] + sorted[mid]) / 2.0;
    }

    public static void main(String[] args) {
        int[] arr = {7, 2, 9, 4, 5, 1};

        System.out.println(findMedian(arr));
    }
}
