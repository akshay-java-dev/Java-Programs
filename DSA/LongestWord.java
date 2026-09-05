public class LongestWord {

    public static void main(String[] args) {

        String str = "Java programming is interesting";

        String current = "";
        String longest = "";

        for (int i = 0; i <= str.length(); i++) {

            if (i == str.length() || str.charAt(i) == ' ') {

                if (current.length() > longest.length()) {
                    longest = current;
                }

                current = "";

            } else {
                current = current + str.charAt(i);
            }
        }

        System.out.println("Longest word: " + longest);
    }
}
