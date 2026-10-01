public class CountWordsMethod {

    static int countWords(String str) {
        str = str.trim();

        if (str.isEmpty()) {
            return 0;
        }

        return str.split("\\s+").length;
    }

    public static void main(String[] args) {
        System.out.println(countWords("Java is very easy"));
    }
}
