public class FindSubarrayWithGivenSum {

    public static void main(String[] args) {

        int[] arr = {1, 4, 20, 3, 10, 5};
        int target = 33;

        int sum = 0;
        int start = 0;

        for (int end = 0; end < arr.length; end++) {

            sum = sum + arr[end];

            while (sum > target && start <= end) {
                sum = sum - arr[start];
                start++;
            }

            if (sum == target) {
                System.out.println("Subarray found from index "
                        + start + " to " + end);
                return;
            }
        }

        System.out.println("Subarray not found");
    }
}
