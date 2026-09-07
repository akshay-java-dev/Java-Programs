public class SortArrayOf012 {

    public static void main(String[] args) {

        int[] arr = {0, 2, 1, 2, 0, 1, 0, 2};

        int zero = 0;
        int one = 0;
        int two = 0;

        for (int num : arr) {
            if (num == 0) {
                zero++;
            } else if (num == 1) {
                one++;
            } else {
                two++;
            }
        }

        int index = 0;

        while (zero > 0) {
            arr[index++] = 0;
            zero--;
        }

        while (one > 0) {
            arr[index++] = 1;
            one--;
        }

        while (two > 0) {
            arr[index++] = 2;
            two--;
        }

        System.out.print("Sorted Array: ");

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
