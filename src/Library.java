public class Library {
    private Book[] books;
    private int bookCount;
    private static final int MAX_BOOKS = 10;

    public Library() {
        books = new Book[MAX_BOOKS];
        bookCount = 0;
    }

    public boolean addBook(Book book) {
        if (bookCount < MAX_BOOKS) {
            books[bookCount++] = book;
            System.out.println("Book added: " + book.getTitle() + " by " + book.getAuthor());
            return true;
        }
        System.out.println("Library is full. Cannot add more books.");
        return false;
    }

    public Book findBook(String isbn) {
        for (int i = 0; i < bookCount; i++)
            if (books[i].getIsbn().equals(isbn)) return books[i];
        return null;
    }

    public void borrowBook(String isbn) {
        Book b = findBook(isbn);
        if (b == null) {
            System.out.println("Book with ISBN " + isbn + " not found.");
        } else if (b.borrowBook()) {
            System.out.println("Book borrowed successfully!");
        } else {
            System.out.println("Book is not available for borrowing.");
        }
    }

    public void returnBook(String isbn) {
        Book b = findBook(isbn);
        if (b == null) {
            System.out.println("Book with ISBN " + isbn + " not found.");
        } else if (b.returnBook()) {
            System.out.println("Book returned successfully!");
        } else {
            System.out.println("Book is already in the library.");
        }
    }

    public void displayAllBooks() {
        if (bookCount == 0) {
            System.out.println("The library is empty.");
            return;
        }
        System.out.println("All books in library:");
        for (int i = 0; i < bookCount; i++) books[i].displayBookInfo();
    }

    public void displayAvailableBooks() {
        System.out.println("Available books:");
        for (int i = 0; i < bookCount; i++)
            if (books[i].isAvailable()) books[i].displayBookInfo();
    }

    public int getBookCount() { return bookCount; }
}
