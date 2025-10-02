import java.util.Arrays;

class DVD extends LibraryItem {
    private int duration;
    private String rating, genre;

    public DVD(String id, String title, String author, int duration, String rating, String genre) {
        super(id, title, author);
        setDuration(duration);
        setRating(rating);
        this.genre = genre;
    }

    public void setDuration(int d){ if(d > 0) duration=d; }
    public void setRating(String r){
        if(Arrays.asList("G","PG","PG-13","R","NC-17").contains(r))
            rating=r;
    }

    @Override public String getItemType() { return "DVD"; }
    @Override public double calculateLateFee(int d) { return d * 1.0; }
    @Override public int getBorrowingPeriod() { return 5; }
    @Override public String getBorrowingStatus(){ return "DVD: " + super.getBorrowingStatus(); }
}