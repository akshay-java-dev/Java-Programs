public class LongestRepeatedCharacterMethod {

    static int longestRepeatedCount(String text) {
        if (text.isEmpty()) {
            return 0;
        }

        int max = 1;
        int current = 1;

        for (int i = 1; i < text.length(); i++) {
            if (text.charAt(i) == text.charAt(i - 1)) {
                current++;
            } else {
                current = 1;
            }

            if (current > max) {
                max = current;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        String text = "aaabbccccdd";
        System.out.println(longestRepeatedCount(text));
    }
}
