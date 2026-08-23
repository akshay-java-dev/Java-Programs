public class Linear {

    public static void main(String[] args) {

        int[] arr = {1, 2, 34, 45, 78};
        int target = 43;

        System.out.println(Find(arr, target, 0));

        System.out.println(Findindex(arr, target, 0));

        System.out.println(FindIndexLast(arr, target, arr.length - 1));
    }

    // Find whether target exists
    static boolean Find(int[] arr, int target, int index) {

        if (index == arr.length) {
            return false;
        }

        return arr[index] == target || Find(arr, target, index + 1);
    }

    // Find first index
    static int Findindex(int[] arr, int target, int index) {

        if (index == arr.length) {
            return -1;
        }

        if (arr[index] == target) {
            return index;
        } else {
            return Findindex(arr, target, index + 1);
        }
    }

    // Find last index
    static int FindIndexLast(int[] arr, int target, int index) {

        if (index == -1) {
            return -1;
        }

        if (arr[index] == target) {
            return index;
        } else {
            return FindIndexLast(arr, target, index - 1);
        }
    }
}