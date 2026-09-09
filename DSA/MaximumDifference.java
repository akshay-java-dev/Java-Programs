public class MaximumDifference {

    public static void main(String[] args) {

        int[] arr = {2, 3, 10, 6, 4, 8, 1};

        int maxDifference = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                int difference = arr[j] - arr[i];

                if (difference > maxDifference) {
                    maxDifference = difference;
                }
            }
        }

        System.out.println("Maximum Difference = " + maxDifference);
    }
}
