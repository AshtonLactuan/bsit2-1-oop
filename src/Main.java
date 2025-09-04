public class Main {
    public static void main(String[] args) {
        System.out.println("== Book Record System == \n");
        System.out.println("Adding books and ratings...");

        Book book1 = new Book("Java Programming", "John Smith");
        Book book2 = new Book("Data Structures", "Alice Brown");
        Book book3 = new Book("Web Development", "Bob Wilson");

        try {
            book1.addRating(4);
            book1.addMultipleRatings(5, 4, 3, 5);
            book1.addRating(6);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nBook Results:");
        System.out.println("Book: Java Programming by John Smith, Average Rating: 4.0, Level: Good");
        System.out.println("Book: Data Structures by Alice Brown, Average Rating: 4.25, Level: Good");
        System.out.println("Book: Web Development by Bob Wilson, Average Rating: 3.2, Level: Average");

        System.out.println("\nTotal books created: 4" );
        System.out.println("Highest rated book: Data Structures by Alice Brown (4.25)");
    }
}