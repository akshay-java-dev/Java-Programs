public class CompareArraysMethod {

    static boolean areEqual(int[] a, int[] b) {
        if (a.length != b.length) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] first = {10, 20, 30};
        int[] second = {10, 20, 30};

        System.out.println(areEqual(first, second));
    }
}
