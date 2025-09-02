public class Main {
    public static void main(String[] args) {
        System.out.println("Library Management System");
        LibraryManager manager = new LibraryManager();

        manager.showBooks();
        manager.addBook();
        manager.removeBook();

        System.out.println("Program completed successfully.");
    }
}
