public class FinallyExample {

    public static void main(String[] args) {

        try {

            int result = 10 / 2;

            System.out.println("Result = " + result);

        } catch (ArithmeticException e) {

            System.out.println("Exception occurred");

        } finally {

            System.out.println("Finally block executed");
        }
    }
}
