public class SecondSmallestMethod {

    static int findSecondSmallest(int[] arr) {
        int smallest = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < smallest) {
                second = smallest;
                smallest = num;
            } else if (num > smallest && num < second) {
                second = num;
            }
        }

        if (second == Integer.MAX_VALUE) {
            return -1;
        }

        return second;
    }

    public static void main(String[] args) {
        int[] arr = {20, 10, 5, 30, 5};

        System.out.println(findSecondSmallest(arr));
    }
}
