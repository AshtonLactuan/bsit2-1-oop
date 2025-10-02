import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        System.out.println("=== LIBRARY MANAGEMENT SYSTEM TEST ===\n");

        LibraryManager m = new LibraryManager();

        System.out.println("=== Adding Items to Library ===");
        Book b = new Book("B1","Java Programming","James Gosling","12345",500,"Programming");
        Magazine mg = new Magazine("M1","Tech Today","Editor Smith",45,"September",true);
        DVD d = new DVD("D1","The Matrix","Wachowski Sisters",136,"R","Sci-Fi");
        m.addItem(b); m.addItem(mg); m.addItem(d);

        System.out.println("\n=== Displaying All Items ===");
        m.displayAllItems();

        System.out.println("\n=== Testing Borrowing ===");
        m.borrowItem("B1","Student John");
        m.borrowItem("D1","Faculty Dr. Smith");

        System.out.println("\n=== Displaying Available Items ===");
        m.displayAvailableItems();

        System.out.println("\n=== Testing Late Fees ===");
        Map<String,Integer> late=new HashMap<>();
        late.put("Java Programming",5);
        late.put("The Matrix",3);
        m.calculateTotalLateFees(late);

        System.out.println("\n=== Testing User Information ===");
        Student s=new Student("U1","John Smith","john@email.com","S1001","Computer Science");
        Faculty f=new Faculty("U2","Dr. Smith","smith@email.com","Engineering","Professor");
        s.addBorrowedItem(b);
        f.addBorrowedItem(d);
        System.out.println("Student: "+s.getName()+" ("+s.getMajor()+") - "+s.getBorrowedItemsCount()+" items borrowed");
        System.out.println("Faculty: "+f.getName()+" ("+f.getDepartment()+") - "+f.getBorrowedItemsCount()+" items borrowed");
    }
}