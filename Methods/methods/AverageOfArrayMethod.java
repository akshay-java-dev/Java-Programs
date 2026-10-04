public class AverageOfArrayMethod {

    static double findAverage(int[] arr) {
        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        return (double) sum / arr.length;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        System.out.println("Average = " + findAverage(arr));
    }
}
