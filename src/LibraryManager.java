import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManager {
    private ArrayList<String> books;
    private Scanner scanner;

    public LibraryManager() {
        books = new ArrayList<>();
        books.add("Java Programming");
        books.add("Web Development");
        books.add("Database Design");
        scanner = new Scanner(System.in);
    }

    public void showBooks() {
        try {
            if (books == null) {
                throw new IllegalStateException("Book list is not initialized.");
            }
            if (books.isEmpty()) {
                System.out.println("No books available in the library.");
            } else {
                System.out.println("\n Current Books");
                for (int i = 0; i < books.size(); i++) {
                    System.out.println((i + 1) + ". " + books.get(i));
                }
            }
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Display operation completed.\n");
        }
    }

    public void addBook() {
        while (true) {
            try {
                System.out.print("Enter book title to add: ");
                String title = scanner.nextLine().trim();

                if (title == null || title.isEmpty()) {
                    throw new IllegalArgumentException("Book title cannot be empty.");
                }
                if (title.length() < 3) {
                    throw new IllegalArgumentException("Book title must be at least 3 characters long.");
                }

                books.add(title);
                System.out.println("Book '" + title + "' added successfully!");
                break;

            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
                System.out.println("Please try again.\n");
            }
        }
        System.out.println("Add book operation completed.\n");
        showBooks();
    }

    public void removeBook() {
        while (true) {
            try {
                if (books.isEmpty()) {
                    System.out.println("Library is empty. No books to remove.");
                    return;
                }

                System.out.print("Enter book number to remove (1-" + books.size() + "): ");
                String input = scanner.nextLine();
                int index = Integer.parseInt(input);

                if (index < 1) {
                    throw new IllegalArgumentException("Book number cannot be negative or zero.");
                }

                String removedBook = books.remove(index - 1);
                System.out.println("Book '" + removedBook + "' removed successfully!");
                break;

            } catch (NumberFormatException e) {
                System.out.println("Invalid input: Please enter a valid number.\n");
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Error: Invalid book number. Please try again.\n");
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid input: " + e.getMessage() + "\n");
            }
        }
        System.out.println("Remove book operation completed.\n");
        showBooks();
    }
}
