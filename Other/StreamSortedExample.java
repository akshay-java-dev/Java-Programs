
import java.util.Arrays;
import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;

public class StreamSortedExample {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(50, 10, 40, 20, 30);

        List<Integer> ascending = numbers.stream()
                .sorted()
                .collect(Collectors.toList());

        List<Integer> descending = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println("Ascending: " + ascending);
        System.out.println("Descending: " + descending);
    }
}
