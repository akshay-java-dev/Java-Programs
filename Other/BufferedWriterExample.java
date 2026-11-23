
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {
    public static void main(String[] args) {

        try {
            BufferedWriter bw =
                new BufferedWriter(new FileWriter("student.txt"));

            bw.write("Name: Akshay");
            bw.newLine();
            bw.write("Course: B.Tech Computer Engineering");
            bw.newLine();
            bw.write("Language: Java");

            bw.close();

            System.out.println("File written successfully!");

        } catch (IOException e) {
            System.out.println("Error writing file.");
        }
    }
}
