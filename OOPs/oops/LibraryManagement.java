import java.util.ArrayList;

class Book {
    int id;
    String title;
    String author;

    Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    void display() {
        System.out.println(id + " | " + title + " | " + author);
    }
}

public class LibraryManagement {
    public static void main(String[] args) {

        ArrayList<Book> books = new ArrayList<>();

        books.add(new Book(1, "Java Programming", "James"));
        books.add(new Book(2, "Spring Boot", "Rod"));
        books.add(new Book(3, "Clean Code", "Robert"));

        for (Book book : books) {
            book.display();
        }
    }
}
