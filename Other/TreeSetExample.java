
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(50);
        numbers.add(20);
        numbers.add(40);
        numbers.add(10);
        numbers.add(20);

        System.out.println("TreeSet: " + numbers);

        System.out.println("First: " + numbers.first());
        System.out.println("Last: " + numbers.last());

        numbers.remove(20);

        System.out.println("After removal: " + numbers);
    }
}
