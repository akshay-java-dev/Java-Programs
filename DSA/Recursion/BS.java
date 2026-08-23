public class BS {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 55, 66, 78};

        int target = 4;

        System.out.println(Search(arr, target, 0, arr.length - 1));
    }

    static int Search(int[] arr, int target, int start, int end) {

        // Base Condition
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if (target < arr[mid]) {
            return Search(arr, target, start, mid - 1);
        }

        return Search(arr, target, mid + 1, end);
    }
}