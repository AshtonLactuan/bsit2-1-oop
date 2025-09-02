import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManager {
    private static ArrayList<String> books = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    static {
        books.add("Java Programming");
        books.add("Web Development");
        books.add("Database Design");
    }

    public static void showBooks() {
        try {
            if (books == null) {
                throw new IllegalStateException("Book list is not initialized!");
            }
            System.out.println("\n--- Current Books ---");
            if (books.isEmpty()) {
                System.out.println("No books available in the library.");
            } else {
                for (int i = 0; i < books.size(); i++) {
                    System.out.println((i + 1) + ". " + books.get(i));
                }
            }
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Display operation completed.");
        }
    }

    public static void addBook() {
        try {
            System.out.print("\nEnter book title to add: ");
            String title = scanner.nextLine().trim();

            if (title == null || title.isEmpty()) {
                throw new IllegalArgumentException("Book title cannot be empty!");
            }
            if (title.length() < 3) {
                throw new IllegalArgumentException("Book title must be at least 3 characters long!");
            }

            books.add(title);
            System.out.println("Book '" + title + "' added successfully!");

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Add book operation completed.");
        }
    }

    public static void removeBook() {
        try {
            if (books.isEmpty()) {
                throw new IllegalStateException("No books to remove!");
            }

            System.out.print("\nEnter book number to remove (1-" + books.size() + "): ");
            String input = scanner.nextLine();

            int index;
            try {
                index = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                throw new NumberFormatException("Please enter a valid number!");
            }

            if (index < 1) {
                throw new IllegalArgumentException("Book number cannot be negative or zero!");
            }
            if (index > books.size()) {
                throw new ArrayIndexOutOfBoundsException("Invalid book number! Please enter between 1 and " + books.size() + ".");
            }

            String removedBook = books.remove(index - 1);
            System.out.println("Book '" + removedBook + "' removed successfully!");

        } catch (NumberFormatException | IllegalArgumentException | ArrayIndexOutOfBoundsException | IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Remove book operation completed.");
        }
    }
}

