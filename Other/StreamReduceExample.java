
import java.util.Arrays;
import java.util.List;

public class StreamReduceExample {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        int sum = numbers.stream()
                .reduce(0, (a, b) -> a + b);

        int product = numbers.stream()
                .reduce(1, (a, b) -> a * b);

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
    }
}
