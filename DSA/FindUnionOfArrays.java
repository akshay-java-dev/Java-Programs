public class FindUnionOfArrays {

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4};
        int[] b = {3, 4, 5, 6};

        System.out.print("Union: ");

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        for (int i = 0; i < b.length; i++) {

            boolean found = false;

            for (int j = 0; j < a.length; j++) {
                if (b[i] == a[j]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.print(b[i] + " ");
            }
        }
    }
}
