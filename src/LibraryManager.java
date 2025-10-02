import java.util.ArrayList;
import java.util.Map;

class LibraryManager {
    private ArrayList<Borrowable> items = new ArrayList<>();

    public void addItem(Borrowable i){
        items.add(i);
        if(i instanceof Book b) System.out.println("Added: Book - "+b.title+" by "+b.author);
        if(i instanceof Magazine m) System.out.println("Added: Magazine - "+m.title+" by "+m.author);
        if(i instanceof DVD d) System.out.println("Added: DVD - "+d.title+" by "+d.author);
    }

    public void displayAllItems(){
        for(Borrowable i:items)
            System.out.println(((LibraryItem)i).getItemInfo());
    }

    public void borrowItem(String id,String borrower){
        for(Borrowable i:items){
            LibraryItem li=(LibraryItem)i;
            if(li.itemId.equals(id) && i.isAvailable()){
                i.borrowItem(borrower);
                System.out.println(borrower+" borrowed: "+li.title);
            }
        }
    }

    public void displayAvailableItems(){
        for(Borrowable i:items)
            if(i.isAvailable())
                System.out.println(((LibraryItem)i).getItemType()+": "+((LibraryItem)i).title+" ("+i.getBorrowingStatus()+")");
    }

    public void calculateTotalLateFees(Map<String,Integer> late){
        for(Borrowable i:items){
            LibraryItem li=(LibraryItem)i;
            if(late.containsKey(li.title))
                System.out.println(li.title+" - "+late.get(li.title)+" days late: $"+li.calculateLateFee(late.get(li.title)));
        }
    }
}