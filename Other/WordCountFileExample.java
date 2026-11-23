
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCountFileExample {
    public static void main(String[] args) {

        int wordCount = 0;

        try {
            BufferedReader br =
                new BufferedReader(new FileReader("student.txt"));

            String line;

            while ((line = br.readLine()) != null) {

                line = line.trim();

                if (!line.isEmpty()) {
                    String[] words = line.split("\\s+");
                    wordCount += words.length;
                }
            }

            br.close();

            System.out.println("Total words: " + wordCount);

        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }
}
