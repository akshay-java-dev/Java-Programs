public class varargs_2 {
    static int multiply(int... arr) {
        int result = 1;  // Start with 1 for multiplication
        for (int a : arr) {
            result *= a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Multiplication of no numbers (default):- " + multiply());
        System.out.println("Multiplication of two numbers :- " + multiply(2, 3));
        System.out.println("Multiplication of three numbers :- " + multiply(1, 5, 10));
    }
}
