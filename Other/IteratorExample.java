
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        Iterator<Integer> iterator = numbers.iterator();

        while (iterator.hasNext()) {
            int num = iterator.next();

            System.out.println(num);

            if (num == 20) {
                iterator.remove();
            }
        }

        System.out.println("After removal: " + numbers);
    }
}
