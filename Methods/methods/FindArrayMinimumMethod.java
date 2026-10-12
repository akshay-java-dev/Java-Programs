public class FindArrayMinimumMethod {

    static int findMinimum(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }

        int min = arr[0];

        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }

        return min;
    }

    public static void main(String[] args) {
        int[] arr = {18, 7, 25, 3, 12};

        System.out.println("Minimum = " + findMinimum(arr));
    }
}
