public class IsValidNumberMethod {

    static boolean isValidInteger(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }

        int start = 0;

        if (str.charAt(0) == '+' || str.charAt(0) == '-') {
            start = 1;
        }

        if (start == str.length()) {
            return false;
        }

        for (int i = start; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isValidInteger("-123"));
        System.out.println(isValidInteger("12a3"));
    }
}
