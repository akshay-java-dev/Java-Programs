public class CountSubstringsMethod {

    static int countSubstring(String str, String sub) {
        if (sub.isEmpty()) {
            return 0;
        }

        int count = 0;

        for (int i = 0; i <= str.length() - sub.length(); i++) {
            if (str.startsWith(sub, i)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(countSubstring("aaaa", "aa"));
    }
}
