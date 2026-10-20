public class SecondMostFrequentCharacterMethod {

    static char secondMostFrequent(String text) {
        int[] freq = new int[Character.MAX_VALUE + 1];

        for (char ch : text.toCharArray()) {
            freq[ch]++;
        }

        int first = 0, second = 0;
        char firstChar = '\0', secondChar = '\0';

        for (char ch : text.toCharArray()) {
            if (freq[ch] > first) {
                if (ch != firstChar) {
                    second = first;
                    secondChar = firstChar;
                }
                first = freq[ch];
                firstChar = ch;
            } else if (ch != firstChar && freq[ch] > second) {
                second = freq[ch];
                secondChar = ch;
            }
        }

        return secondChar;
    }

    public static void main(String[] args) {
        System.out.println(
            secondMostFrequent("aabbcccdddd")
        );
    }
}
