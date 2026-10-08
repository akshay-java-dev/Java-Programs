public class LCMMethod {

    static int findLCM(int a, int b) {

        int max = Math.max(a, b);

        while (true) {

            if (max % a == 0 && max % b == 0) {
                return max;
            }

            max++;
        }
    }

    public static void main(String[] args) {

        System.out.println("LCM = " + findLCM(12, 18));
    }
}
