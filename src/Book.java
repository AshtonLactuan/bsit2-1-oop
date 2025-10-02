class Book extends LibraryItem {
    private String isbn, genre;
    private int pages;

    public Book(String id, String title, String author, String isbn, int pages, String genre) {
        super(id, title, author);
        this.isbn = isbn;
        setNumberOfPages(pages);
        setGenre(genre);
    }

    public void setGenre(String g) { if(g!=null && !g.isEmpty()) genre=g; }
    public void setNumberOfPages(int p) { if(p>0) pages=p; }

    @Override public String getItemType() { return "Book"; }
    @Override public double calculateLateFee(int d) { return d * 0.50; }
    @Override public int getBorrowingPeriod() { return 14; }
}