public class NextGreaterElement {

    public static void main(String[] args) {

        int[] arr = {4, 5, 2, 10, 8};

        System.out.println("Next greater elements:");

        for (int i = 0; i < arr.length; i++) {

            int next = -1;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] > arr[i]) {
                    next = arr[j];
                    break;
                }
            }

            System.out.println(arr[i] + " -> " + next);
        }
    }
}
