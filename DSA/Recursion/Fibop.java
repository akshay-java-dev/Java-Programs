public class Fibop {
    public static void main(String[] args) {
        System.out.println(Fiboex(6));
    }

    static int Fiboex(int n) {
        // Base Condition
        if (n < 2) {
            return n;
        }

        return Fiboex(n - 1) + Fiboex(n - 2);
    }
}