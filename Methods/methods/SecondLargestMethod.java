public class SecondLargestMethod {

    static int findSecondLargest(int[] arr) {

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {

            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        return secondLargest;
    }

    public static void main(String[] args) {

        int[] arr = {10, 25, 15, 40, 30};

        System.out.println("Second Largest = " + findSecondLargest(arr));
    }
}
