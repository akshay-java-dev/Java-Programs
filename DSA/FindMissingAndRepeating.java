public class FindMissingAndRepeating {

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 4, 5};

        int n = arr.length;

        int missing = 0;
        int repeating = 0;

        for (int i = 1; i <= n; i++) {

            int count = 0;

            for (int j = 0; j < n; j++) {
                if (arr[j] == i) {
                    count++;
                }
            }

            if (count == 0) {
                missing = i;
            }

            if (count > 1) {
                repeating = i;
            }
        }

        System.out.println("Missing Number = " + missing);
        System.out.println("Repeating Number = " + repeating);
    }
}
