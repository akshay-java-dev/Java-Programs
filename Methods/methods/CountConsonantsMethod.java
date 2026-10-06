public class CountConsonantsMethod {

    static int countConsonants(String str) {
        int count = 0;

        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z' &&
                ch != 'a' && ch != 'e' &&
                ch != 'i' && ch != 'o' && ch != 'u') {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(countConsonants("Java Programming"));
    }
}
