public class FindLongestWordMethod {

    static String findLongestWord(String sentence) {
        String[] words = sentence.trim().split("\\s+");
        String longest = "";

        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        return longest;
    }

    public static void main(String[] args) {
        System.out.println(
            findLongestWord("Java methods improve coding skills")
        );
    }
}
