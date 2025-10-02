import java.util.ArrayList;

abstract class User {
    private String id, name, email;
    private ArrayList<LibraryItem> borrowed = new ArrayList<>();

    public User(String id, String name, String email) {
        this.id = id; this.name = name; this.email = email;
    }

    public String getName(){ return name; }
    public void addBorrowedItem(LibraryItem i){ borrowed.add(i); }
    public int getBorrowedItemsCount(){ return borrowed.size(); }
    public abstract int getMaxBorrowLimit();
}