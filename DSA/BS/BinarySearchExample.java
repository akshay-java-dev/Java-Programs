public class BinarySearchExample {

    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16};
        int target = 10;

        int result = binarySearch(arr, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }

    // return index
    // return -1 if it does not exist
    static int binarySearch(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            // Find the middle element (safe way)
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;   // search left
            } else if (target > arr[mid]) {
                start = mid + 1; // search right
            } else {
                return mid;      // element found
            }
        }

        return -1; // element not found
    }
}