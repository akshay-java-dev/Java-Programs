public class findFL {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;

        int[] result = searchRange(nums, target);

        System.out.println("First: " + result[0]);
        System.out.println("Last: " + result[1]);
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};

        ans[0] = search(nums, target, true);   // first position
        ans[1] = search(nums, target, false);  // last position

        return ans;
    }

    static int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                ans = mid;

                if (findStartIndex) {
                    end = mid - 1;   // go left
                } else {
                    start = mid + 1; // go right
                }
            }
        }

        return ans;
    }
}