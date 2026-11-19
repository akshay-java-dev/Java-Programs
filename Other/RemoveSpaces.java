
public class RemoveSpaces {
    public static void main(String[] args) {
        String text = "Java is very easy";

        String result = text.replaceAll("\\s", "");

        System.out.println("Original: " + text);
        System.out.println("Without spaces: " + result);
    }
}
