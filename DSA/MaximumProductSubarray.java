public class MaximumProductSubarray {

    public static void main(String[] args) {

        int[] arr = {2, 3, -2, 4};

        int maxProduct = arr[0];
        int minProduct = arr[0];
        int answer = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < 0) {
                int temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }

            maxProduct = Math.max(arr[i], maxProduct * arr[i]);
            minProduct = Math.min(arr[i], minProduct * arr[i]);

            answer = Math.max(answer, maxProduct);
        }

        System.out.println("Maximum Product = " + answer);
    }
}
