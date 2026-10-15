public class FindPairWithDifferenceMethod {

    static void findPairs(int[] arr, int target) {
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                long difference = Math.abs((long) arr[i] - arr[j]);

                if (difference == target) {
                    System.out.println(arr[i] + " and " + arr[j]);
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("No pairs found");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 7, 9};

        findPairs(arr, 2);
    }
}
