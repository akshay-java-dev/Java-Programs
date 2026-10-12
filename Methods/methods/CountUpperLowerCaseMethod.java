public class CountUpperLowerCaseMethod {

    static void countCases(String str) {
        int upper = 0;
        int lower = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isUpperCase(ch)) {
                upper++;
            } else if (Character.isLowerCase(ch)) {
                lower++;
            }
        }

        System.out.println("Uppercase = " + upper);
        System.out.println("Lowercase = " + lower);
    }

    public static void main(String[] args) {
        countCases("Java Programming");
    }
}
