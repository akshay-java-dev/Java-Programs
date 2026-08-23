public class main1 {
    public static void main(String[] args) {
        int[] nums = {1, 4, 55, 66, 23, 78, 98, 9};
        int target = 55;   // ✅ defined target

        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];

            if (element == target) {   // ✅ removed semicolon + added {}
                return element;
            }
        }

        return -1;   // ✅ correct placement
    }
}