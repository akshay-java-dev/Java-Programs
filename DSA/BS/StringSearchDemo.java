public class StringSearchDemo {
    public static void main(String[] args) {
        String name = "Akshay";
        char target = 'y';

        System.out.println(stringSearch(name, target));
    }

    static boolean stringSearch(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

        for (int index = 0; index < str.length(); index++) {
            if (target == str.charAt(index)) {  // ✅ fixed
                return true;
            }
        }

        return false;  // ✅ inside method
    }
}