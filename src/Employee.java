public class Employee extends Person{
    private int office;
    private String Date_Hired;
    private String rank;
    private int empid;

    public Employee() {
    }

    public Employee(int office, String Date_Hired, double Salary, String rank, int empid, String name, int age, String Address, String Email_Address, double salary) {
        super(name, age, Address, Email_Address, salary);
        this.office = office;
        this.Date_Hired = Date_Hired;
        this.rank = rank;
        this.empid = empid;
    }

    public void setOffice(int office) {
        this.office = office;
    }

    public void setDate_Hired(String Date_Hired) {
        this.Date_Hired = Date_Hired;
    }


    public void setRank(String rank) {
        this.rank = rank;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public int getOffice() {
        return office;
    }

    public String getDate_Hired() {
        return Date_Hired;
    }
    public String getRank() {
        return rank;
    }

    public int getEmpid() {
        return empid;
    }

    @Override
    public double getSalary() {
        return super.getSalary()*1.1;
    }
    
   
    }

   

