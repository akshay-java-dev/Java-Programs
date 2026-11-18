
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer, String> students = new TreeMap<>();

        students.put(103, "Amit");
        students.put(101, "Akshay");
        students.put(102, "Rahul");

        System.out.println("Students: " + students);

        System.out.println("First key: " + students.firstKey());
        System.out.println("Last key: " + students.lastKey());

        students.remove(102);

        System.out.println("After removal: " + students);
    }
}
