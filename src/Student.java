public class Student extends Person{

     private int studentid;
     private String specielization;

    public Student() {
    }

    public Student(int studentid, String specielization, String name, int age, String Address, String Email_Address, double salary) {
        super(name, age, Address, Email_Address, salary);
        this.studentid = studentid;
        this.specielization = specielization;
    }




    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }
        public int getStudentid() {
        return studentid;
    }



    public void setSpecielization(String specielization) {
        this.specielization = specielization;
    }
        public String getSpecielization() {
        return specielization;
    }
}



    
    