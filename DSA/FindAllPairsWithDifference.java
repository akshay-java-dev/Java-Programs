public class FindAllPairsWithDifference {

    public static void main(String[] args) {

        int[] arr = {1, 5, 3, 4, 2};
        int difference = 2;

        System.out.println("Pairs:");

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                int diff = arr[i] - arr[j];

                if (diff == difference || diff == -difference) {
                    System.out.println("(" + arr[i] + ", " + arr[j] + ")");
                }
            }
        }
    }
}
