class Student extends User {
    private String major;
    public Student(String id,String name,String email,String studentId,String major){
        super(id,name,email); this.major=major;
    }
    public String getMajor(){ return major; }
    @Override
    public int getMaxBorrowLimit(){ return 5; }
}