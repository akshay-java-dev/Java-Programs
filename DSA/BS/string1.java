import java.util.*;

public class string1 {
    public static void main(String[] args) {
        String name = "Akshay";
        char target = 'y';

        // Using both methods
        System.out.println(stringSearch(name, target));
        System.out.println(stringSearch2(name, target));

        System.out.println(Arrays.toString(name.toCharArray()));
    }

    static boolean stringSearch(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

        for (int index = 0; index < str.length(); index++) {
            if (target == str.charAt(index)) {
                return true;
            }
        }

        return false;
    }

    static boolean stringSearch2(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

        for (char ch : str.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }

        return false;
    }
}