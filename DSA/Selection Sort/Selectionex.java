import java.util.Arrays;

public class Selectionex {

    public static void main(String[] args) {
        int[] arr = {5, 2, 1, 6, 3};

        Selection(arr);

        System.out.println(Arrays.toString(arr));
    }

    static void Selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {

            // Find the maximum element in the unsorted part
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);

            // Swap it with the last unsorted position
            swap(arr, maxIndex, last);
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    private static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;

        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }

        return max;
    }
}