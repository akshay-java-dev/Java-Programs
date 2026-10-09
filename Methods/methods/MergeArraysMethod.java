public class MergeArraysMethod {

    static int[] merge(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];

        for (int i = 0; i < a.length; i++) {
            result[i] = a[i];
        }

        for (int i = 0; i < b.length; i++) {
            result[a.length + i] = b[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] a = {10, 20, 30};
        int[] b = {40, 50, 60};

        int[] result = merge(a, b);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
