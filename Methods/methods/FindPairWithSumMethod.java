public class FindPairWithSumMethod {

    static void findPairs(int[] arr, int target) {
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(arr[i] + " + "
                            + arr[j] + " = " + target);
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("No pairs found");
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 5, 7, 1};
        findPairs(arr, 6);
    }
}
