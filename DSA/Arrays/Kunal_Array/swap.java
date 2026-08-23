import java.util.Arrays;

public class swap {
    public static void main(String[] args) {

        int[] arr = {1, 36, 45, 67};

        swap(arr, 0, 3);   // Correct index

        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int index1, int index2) {

        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}