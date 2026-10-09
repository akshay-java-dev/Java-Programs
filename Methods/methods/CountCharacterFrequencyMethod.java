public class CountCharacterFrequencyMethod {

    static int countCharacter(String str, char target) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(countCharacter("programming", 'g'));
    }
}
