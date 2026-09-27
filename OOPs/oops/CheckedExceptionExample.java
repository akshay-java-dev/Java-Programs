import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionExample {

    public static void main(String[] args) {

        try {

            FileReader file =
                    new FileReader("data.txt");

            System.out.println("File opened");

            file.close();

        } catch (IOException e) {

            System.out.println(
                    "File could not be opened"
            );
        }
    }
}
