public class ArraySumMethod {

    static int calculateSum(int[] arr) {
        int sum = 0;

        for (int num : arr) {
            sum = sum + num;
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};

        System.out.println(calculateSum(arr));
    }
}
