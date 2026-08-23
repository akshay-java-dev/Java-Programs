import java.util.*;
public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println((char)('a' + 3));
        System.out.println("a" + 3);
        // This is same as after a few steps : "a" +"1"
        //Integer will be converted to Integer that will call toString()

        System.out.println("Akshay" + new ArrayList<>());
        //System.out.println("Akshay"  + new Integer(56));
    }
}
