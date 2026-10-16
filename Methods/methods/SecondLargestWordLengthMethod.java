public class SecondLargestWordLengthMethod {

    static int secondLargestLength(String sentence) {
        String[] words = sentence.trim().split("\\s+");
        int largest = -1, second = -1;

        for (String word : words) {
            int length = word.length();

            if (length > largest) {
                second = largest;
                largest = length;
            } else if (length < largest && length > second) {
                second = length;
            }
        }

        return second;
    }

    public static void main(String[] args) {
        String text = "Java makes programming enjoyable";
        System.out.println(secondLargestLength(text));
    }
}
