class Magazine extends LibraryItem {
    private int issue;
    private String month;
    private boolean latest;

    public Magazine(String id, String title, String author, int issue, String month, boolean latest) {
        super(id, title, author);
        setIssue(issue);
        this.month = month;
        this.latest = latest;
    }

    public void setIssue(int i){ if(i > 0) issue=i; }

    @Override public String getItemType() { return "Magazine"; }
    @Override public double calculateLateFee(int d) { return d * 0.25; }
    @Override public int getBorrowingPeriod() { return 7; }
}