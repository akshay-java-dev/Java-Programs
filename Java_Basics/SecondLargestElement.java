
public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {10, 25, 5, 40, 30};

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

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("Second largest element not found");
        } else {
            System.out.println("Second largest: " + secondLargest);
        }
    }
}
