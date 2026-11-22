
import java.io.FileWriter;
import java.io.IOException;

public class FileAppendExample {
    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("myfile.txt", true);

            writer.write("\nThis is appended text.");

            writer.close();

            System.out.println("Data appended successfully!");

        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}
