class Faculty extends User {
    private String dept;
    public Faculty(String id,String name,String email,String dept,String pos){
        super(id,name,email); this.dept=dept;
    }
    public String getDepartment(){ return dept; }

    @Override
    public int getMaxBorrowLimit(){ return 10; }
}