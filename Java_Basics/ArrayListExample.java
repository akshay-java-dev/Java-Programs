
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Akshay");
        names.add("Rahul");
        names.add("Amit");

        System.out.println("Names: " + names);

        names.remove("Rahul");

        System.out.println("After removing: " + names);
        System.out.println("First name: " + names.get(0));
        System.out.println("Size: " + names.size());
    }
}
