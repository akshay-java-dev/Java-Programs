public class FirstRepeatingElementMethod {

    static int firstRepeating(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {4, 7, 2, 7, 4, 9};

        System.out.println("First repeating element: "
                + firstRepeating(arr));
    }
}
