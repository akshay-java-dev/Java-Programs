public class FrequencyMethod {

    static int countFrequency(int[] arr, int target) {

        int count = 0;

        for (int num : arr) {
            if (num == target) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 10, 30, 10, 40};

        System.out.println("Frequency = " + countFrequency(arr, 10));
    }
}
