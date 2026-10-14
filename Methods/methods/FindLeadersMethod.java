public class FindLeadersMethod {

    static void findLeaders(int[] arr) {
        int maxRight = Integer.MIN_VALUE;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] >= maxRight) {
                System.out.print(arr[i] + " ");
                maxRight = arr[i];
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        findLeaders(arr);
    }
}
