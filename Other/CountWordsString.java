
public class CountWordsString {
    public static void main(String[] args) {
        String sentence = "Java is a powerful programming language";

        String[] words = sentence.trim().split("\\s+");

        System.out.println("Sentence: " + sentence);
        System.out.println("Word count: " + words.length);
    }
}
