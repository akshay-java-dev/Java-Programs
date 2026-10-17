public class MostFrequentElementMethod {

    static int mostFrequent(int[] arr) {
        int best = arr[0];
        int maxCount = 0;

        for (int i = 0; i < arr.length; i++) {
            int count = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                best = arr[i];
            }
        }

        return best;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 5, 2, 3, 5};
        System.out.println("Most frequent: " + mostFrequent(arr));
    }
}
