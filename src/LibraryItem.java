abstract class LibraryItem implements Borrowable {
    protected String itemId, title, author, borrowerName = "";
    protected boolean isCheckedOut = false;

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public String getItemInfo() {
        return getItemType() + ": " + title + " (" + getBorrowingStatus() + ")";
    }

    public void checkOut(String borrower) { isCheckedOut = true; borrowerName = borrower; }
    public void checkIn() { isCheckedOut = false; borrowerName = ""; }

    public abstract String getItemType();
    public abstract double calculateLateFee(int daysLate);

    @Override
    public boolean isAvailable() { return !isCheckedOut; }

    @Override
    public void borrowItem(String borrower) { checkOut(borrower); }

    @Override
    public void returnItem() { checkIn(); }
}