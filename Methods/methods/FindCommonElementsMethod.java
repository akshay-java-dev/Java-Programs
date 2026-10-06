public class FindCommonElementsMethod {

    static void findCommon(int[] arr1, int[] arr2) {

        for (int i = 0; i < arr1.length; i++) {

            for (int j = 0; j < arr2.length; j++) {

                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {

        int[] arr1 = {10, 20, 30, 40};
        int[] arr2 = {20, 40, 50, 60};

        findCommon(arr1, arr2);
    }
}
