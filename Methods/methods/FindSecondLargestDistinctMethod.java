public class FindSecondLargestDistinctMethod {

    static int findSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                second = largest;
                largest = num;
            } else if (num < largest && num > second) {
                second = num;
            }
        }

        if (second == Integer.MIN_VALUE) {
            return -1;
        }

        return second;
    }

    public static void main(String[] args) {
        int[] arr = {10, 40, 20, 40, 30};
        System.out.println(findSecondLargest(arr));
    }
}
