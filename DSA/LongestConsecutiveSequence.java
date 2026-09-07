public class LongestConsecutiveSequence {

    public static void main(String[] args) {

        int[] arr = {100, 4, 200, 1, 3, 2};

        int longest = 0;

        for (int i = 0; i < arr.length; i++) {

            int count = 1;
            int current = arr[i];

            for (int j = 0; j < arr.length; j++) {

                boolean found = false;

                for (int k = 0; k < arr.length; k++) {
                    if (arr[k] == current + 1) {
                        found = true;
                        break;
                    }
                }

                if (found) {
                    current++;
                    count++;
                } else {
                    break;
                }
            }

            if (count > longest) {
                longest = count;
            }
        }

        System.out.println("Longest Consecutive Length = " + longest);
    }
}
