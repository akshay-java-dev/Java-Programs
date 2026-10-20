public class UniqueCharactersMethod {

    static boolean hasUniqueCharacters(String text) {
        for (int i = 0; i < text.length(); i++) {
            for (int j = i + 1; j < text.length(); j++) {
                if (text.charAt(i) == text.charAt(j)) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(hasUniqueCharacters("Java"));
        System.out.println(hasUniqueCharacters("World"));
    }
}
