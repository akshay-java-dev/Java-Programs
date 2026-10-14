public class CheckBalancedParenthesesMethod {

    static boolean isBalanced(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '(') {
                count++;
            } else if (ch == ')') {
                count--;

                if (count < 0) {
                    return false;
                }
            }
        }

        return count == 0;
    }

    public static void main(String[] args) {
        System.out.println(isBalanced("(a+b)*(c+d)"));
        System.out.println(isBalanced("((a+b)"));
    }
}
