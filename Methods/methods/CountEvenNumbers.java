public class CountEvenNumbers {

    static int countEven(int[] arr) {
        int count = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 11, 14, 17};

        System.out.println(countEven(arr));
    }
}
