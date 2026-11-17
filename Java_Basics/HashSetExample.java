
import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(20);
        numbers.add(40);

        System.out.println("HashSet: " + numbers);

        System.out.println("Contains 30: " + numbers.contains(30));

        numbers.remove(10);

        System.out.println("After removing 10: " + numbers);
        System.out.println("Size: " + numbers.size());
    }
}
