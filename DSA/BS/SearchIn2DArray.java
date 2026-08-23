import java.util.*;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int [][] arr = {
            {23,44,66},
            {22,56,76,89},
            {12,4,5,6},
            {1,2}
        };

        int target = 1;
        int[] ans = Search(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] Search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};  // ✅ fixed
                }
            }
        }

        return new int[]{-1, -1};  // ✅ if not found
    }
}