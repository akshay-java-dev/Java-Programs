import java.util.*;
public class Duplicate {
    public static void main(String[] args) {
        int arr[] = {4,2,4,1,3};   // Fixed comma
        int ans = Find(arr);
        System.out.println(ans);
    }

    static int Find(int arr[]) {
        int i = 0;

        while (i < arr.length) {
            int correct = arr[i] - 1;

            if (arr[i] != i + 1) {
                if (arr[i] != arr[correct]) {
                    swap(arr, i, correct);
                } else {
                    return arr[i];
                }
            } else {
                i++;
            }
        }
        return -1;
    }

    static void swap(int arr[], int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}