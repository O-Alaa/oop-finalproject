public class Mathematics extends Department {
    private int department_capacity;
        private double department_cgpa;
        private String subjects = "\"Analytical Geometrey - Linear Algebra - Mathematical Analysis - Mathematical Logic - Mechanics\"";

    public Mathematics() {
    }

    public Mathematics(int department_capacity, double department_cgpa) {
        this.department_capacity = department_capacity;
        this.department_cgpa = department_cgpa;
    }

    public void setDepartment_capacity(int department_capacity) {
        this.department_capacity = department_capacity;
    }

    public void setDepartment_cgpa(double department_cgpa) {
        this.department_cgpa = department_cgpa;
    }
    

    public int getDepartment_capacity() {
        return department_capacity;
    }

    public double getDepartment_cgpa() {
        return department_cgpa;
    }

    public void setSubjects(String subjects) {
        this.subjects = subjects;
    }

    public String getSubjects() {
        return subjects;
    }


}
