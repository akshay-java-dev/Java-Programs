public class FindLargestWordMethod {

    static String longestWord(String str) {
        String[] words = str.split("\\s+");

        String largest = words[0];

        for (String word : words) {
            if (word.length() > largest.length()) {
                largest = word;
            }
        }

        return largest;
    }

    public static void main(String[] args) {
        System.out.println(longestWord("Java programming is interesting"));
    }
}
