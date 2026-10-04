public class SearchElementMethod {

    static boolean search(int[] arr, int target) {

        for (int num : arr) {
            if (num == target) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        if (search(arr, 30)) {
            System.out.println("Element Found");
        } else {
            System.out.println("Element Not Found");
        }
    }
}
