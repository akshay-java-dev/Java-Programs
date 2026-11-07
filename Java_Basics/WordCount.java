
public class WordCount {
    public static void main(String[] args) {
        String str = "Java is a powerful programming language";

        str = str.trim();

        int count = 0;

        if (!str.isEmpty()) {
            String[] words = str.split("\\s+");
            count = words.length;
        }

        System.out.println("Total words: " + count);
    }
}
