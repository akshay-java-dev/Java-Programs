public class Fibonacci {

    public static void main(String[] args) {
        //for(int i = 1; i < 11; i++){
         //   System.out.println(FiboFormula(i));
        //}
        System.out.println(FiboFormula(50));
    }

    static int FiboFormula(int n) {

        /*return (int) (
                (Math.pow((1 + Math.sqrt(5)) / 2, n)
                - Math.pow((1 - Math.sqrt(5)) / 2, n))
                / Math.sqrt(5)
        );*/
        return (int)(Math.pow((( 1 + Math.sqrt(5)) / 2), n) / Math.sqrt(5));
    }

    static int Fibon(int n) {

        if (n < 2) {
            return n;
        }

        return Fibon(n - 1) + Fibon(n - 2);
    }
}