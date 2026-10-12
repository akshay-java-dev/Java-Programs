public class CountOccurrencesMethod {

    static int countOccurrences(int[] arr, int target) {
        int count = 0;

        for (int num : arr) {
            if (num == target) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 5, 8, 5, 10};

        System.out.println(countOccurrences(arr, 5));
    }
}
