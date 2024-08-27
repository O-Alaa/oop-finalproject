public class Chemistry extends Department{
        private int department_capacity;
        private double department_cgpa;
        private String subjects = "\"Analytical Chemistry, Mathematical Analysis, Organic Chemistry, Chemistry of Main group elements, Thermodynamics\" ";

    public Chemistry(int department_capacity, double department_cgpa) {
        this.department_capacity = department_capacity;
        this.department_cgpa = department_cgpa;
    }

    public void setDepartment_capacity(int department_capacity) {
        this.department_capacity = department_capacity;
    }
    public int getDepartment_capacity() {
        return department_capacity;
    }

    public void setDepartment_cgpa(double department_cgpa) {
        this.department_cgpa = department_cgpa;
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

