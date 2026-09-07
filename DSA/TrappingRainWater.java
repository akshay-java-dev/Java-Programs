public class TrappingRainWater {

    public static int trap(int[] arr) {
        int n = arr.length;
        int water = 0;

        for (int i = 1; i < n - 1; i++) {
            int leftMax = arr[i];
            int rightMax = arr[i];

            for (int j = 0; j < i; j++) {
                if (arr[j] > leftMax) {
                    leftMax = arr[j];
                }
            }

            for (int j = i + 1; j < n; j++) {
                if (arr[j] > rightMax) {
                    rightMax = arr[j];
                }
            }

            int minHeight = Math.min(leftMax, rightMax);
            water += minHeight - arr[i];
        }

        return water;
    }

    public static void main(String[] args) {
        int[] arr = {3, 0, 0, 2, 0, 4};

        System.out.println("Trapped Water = " + trap(arr));
    }
}
