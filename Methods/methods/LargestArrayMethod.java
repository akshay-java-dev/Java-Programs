public class LargestArrayMethod {

    static int findLargest(int[] arr) {
        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        return largest;
    }

    public static void main(String[] args) {
        int[] arr = {10, 25, 7, 40, 15};

        System.out.println(findLargest(arr));
    }
}
