class library {
    String[] books;
    int no_of_books;

    library() {
        this.books = new String[100];
        this.no_of_books = 0;
    }

    void addBook(String book) {
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book + " has been added!");
    }

    void showAvailableBooks() {
        System.out.println("Available Books are:");
        for (String book : this.books) {
            if (book == null) {
                continue;
            }
            System.out.println("* " + book);
        }
    }

    void returnBook(String book) {
        addBook(book);
    }

    void issueBook(String book) {
        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i] != null && this.books[i].equals(book)) {
                System.out.println("The Book has been Issued");
                this.books[i] = null;   // ✅ only remove that book
                return;
            }
        }
        System.out.println("This Book does not exist");
    }
}

public class online_lib {
    public static void main(String[] args) {
        library l = new library();
        l.addBook("Think And Grow Rich");
        l.addBook("java");
        l.addBook("python");
        l.addBook("data Structure");
        l.addBook("Computur algorithm");

        l.showAvailableBooks();
        l.issueBook("java");
        l.returnBook("java");
        l.showAvailableBooks();
    }
}
