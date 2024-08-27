public class Lecturer extends Person {
    
    private int lecturerid;
    private String ltrank;
 
    

    public Lecturer() {
    }

    public Lecturer(int lecturerid, String ltrank, String name, int age, String Address, String Email_Address, double salary) {
        super(name, age, Address, Email_Address, salary);
        this.lecturerid = lecturerid;
        this.ltrank = ltrank;
    }

    public void setLecturerid(int lecturerid) {
        this.lecturerid = lecturerid;
    }

    public void setLtrank(String ltrank) {
        this.ltrank = ltrank;
    }


    public int getLecturerid() {
        return lecturerid;
    }

    public String getLtrank() {
        return ltrank;
    }

    @Override
    public double getSalary() {
        return super.getSalary()*1.5; 
    }
    
}
