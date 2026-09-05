public class StringRotation {

    public static void main(String[] args) {

        String str1 = "abcd";
        String str2 = "cdab";

        if (str1.length() != str2.length()) {
            System.out.println("Not a rotation");
            return;
        }

        String combined = str1 + str1;

        boolean found = false;

        for (int i = 0; i <= combined.length() - str2.length(); i++) {

            int j = 0;

            while (j < str2.length()
                    && combined.charAt(i + j) == str2.charAt(j)) {
                j++;
            }

            if (j == str2.length()) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Strings are rotations");
        } else {
            System.out.println("Strings are not rotations");
        }
    }
}
