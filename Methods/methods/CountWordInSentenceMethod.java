public class CountWordInSentenceMethod {

    static int countWord(String sentence, String target) {
        if (target.isEmpty()) {
            return 0;
        }

        String[] words = sentence.toLowerCase().trim().split("\\s+");
        int count = 0;

        for (String word : words) {
            if (word.equals(target.toLowerCase())) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String sentence = "Java is easy and Java is powerful";

        System.out.println(countWord(sentence, "Java"));
    }
}
