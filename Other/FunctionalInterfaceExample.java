
@FunctionalInterface
interface Calculator {
    int add(int a, int b);
}

public class FunctionalInterfaceExample {
    public static void main(String[] args) {

        Calculator c = (a, b) -> a + b;

        int result = c.add(10, 20);

        System.out.println("Addition: " + result);
    }
}
