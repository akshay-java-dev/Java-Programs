
import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Akshay");
        students.put(102, "Rahul");
        students.put(103, "Amit");

        System.out.println("Students: " + students);

        System.out.println("Student 101: " + students.get(101));

        students.put(102, "Rohit");

        System.out.println("After updating: " + students);

        students.remove(103);

        System.out.println("After removing: " + students);
    }
}
