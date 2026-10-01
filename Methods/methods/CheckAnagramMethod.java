import java.util.Arrays;

public class CheckAnagramMethod {

    static boolean isAnagram(String str1, String str2) {

        char[] a = str1.toLowerCase().toCharArray();
        char[] b = str2.toLowerCase().toCharArray();

        if (a.length != b.length) {
            return false;
        }

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);
    }

    public static void main(String[] args) {

        if (isAnagram("listen", "silent")) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }
}
