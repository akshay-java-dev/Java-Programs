public class FindArrayDifferenceMethod {

    static int findDifference(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }

        int min = arr[0];
        int max = arr[0];

        for (int num : arr) {
            if (num < min) {
                min = num;
            }

            if (num > max) {
                max = num;
            }
        }

        return max - min;
    }

    public static void main(String[] args) {
        int[] arr = {12, 5, 30, 8, 20};
        System.out.println(findDifference(arr));
    }
}
