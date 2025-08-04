public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Cabalde's Hard Journey", "LLatuna, Johnden", 328, true);
        Book book2 = new Book("Baho nga Utot", "Cabalde, Christian", 281, true);
        Book book3 = new Book("Johnden Life Story", "Lactuan, Ashton", 180, true);

        book1.displayInfo();
        book1.borrowBook();
        book1.displayInfo();
        book1.returnBook();
        book1.displayInfo();
    }
}

class Book {
    String title = "";
    String author = "";
    int pages = 0;
    boolean isAvailable = false;

    public Book(String bookTitle, String bookAuthor, int bookPages, boolean bookIsAvailable) {
        title = bookTitle;
        author = bookAuthor;
        pages = bookPages;
        isAvailable = bookIsAvailable;
        System.out.println("A new book " + title + " by author " + author + " has been added to the library!");
    }

    void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Book Author: " + author);
        System.out.println("Book Pages: " + pages);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Unavailable"));
    }

    void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("The book " + title + " has been borrowed");
        } else {
            System.out.println("The book " + title + " is currently not available");
        }
    }

    void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("The book " + title + " has been returned");
        } else {
            System.out.println("The book " + title + " was not borrowed");
        }
    }
}