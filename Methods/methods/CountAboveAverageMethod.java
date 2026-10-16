public class CountAboveAverageMethod {

    static int countAboveAverage(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }

        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

        double average = (double) sum / arr.length;
        int count = 0;

        for (int num : arr) {
            if (num > average) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println(countAboveAverage(numbers));
    }
}
