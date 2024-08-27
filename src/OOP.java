import java.util.Scanner;

public class OOP {
    public OOP() {
    }

    public static void main(String[] args) {
        College cn = new College();
        System.out.println(cn.getCollege_name());

        int x;
        do {
            System.out.println("Please choose what you want from the menu.");
            System.out.println("1.Students");
            System.out.println("2.Lecturer");
            System.out.println("3.Employee");
            System.out.println("4.Departments");
            System.out.println("5.SummerCourses");
            System.out.println("If you want to exit please enter '0'");
            Scanner input = new Scanner(System.in);
            x = input.nextInt();
            switch (x) {
                case 1:
                    System.out.println("Welcome to students board");
                    System.out.println("Please enter your Name");
                    Student st = new Student();
                    String name = input.next();
                    st.setName(name);
                    System.out.println("Please enter your Age");
                    int age = input.nextInt();
                    st.setAge(age);
                    System.out.println("Please enter your Address");
                    String address = input.next();
                    st.setAddress(address);
                    System.out.println("Please enter your Email Address");
                    String email = input.next();
                    st.setEmail_Address(email);
                    System.out.println("Please enter your ID");
                    int id = input.nextInt();
                    st.setStudentid(id);
                    System.out.println("Please enter your Specialization");
                    String special = input.next();
                    st.setSpecielization(special);
                    System.out.println();
                    System.out.println("Your Name is " + st.getName());
                    System.out.println("Your Age is " + st.getAge());
                    System.out.println("Your Address is " + st.getAddress());
                    System.out.println("Your E-mail Address is " + st.getEmail_Address());
                    System.out.println("Your ID is " + st.getStudentid());
                    System.out.println("Your Specialization is " + st.getSpecielization());
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Welome to Lecturers board");
                    Lecturer lt = new Lecturer();
                    System.out.println("Please enter your Name");
                    String ltname = input.next();
                    lt.setName(ltname);
                    System.out.println("Please enter your Age");
                    int ltage = input.nextInt();
                    lt.setAge(ltage);
                    System.out.println("Please enter your Address");
                    String ltaddress = input.next();
                    lt.setAddress(ltaddress);
                    System.out.println("Please enter your Email Address");
                    String ltemail = input.next();
                    lt.setEmail_Address(ltemail);
                    System.out.println("Please enter your ID");
                    int ltid = input.nextInt();
                    lt.setLecturerid(ltid);
                    System.out.println("Please enter your rank");
                    String ltrank = input.next();
                    lt.setLtrank(ltrank);
                    System.out.println("Please enter your salary");
                    double ltsal = input.nextDouble();
                    lt.setSalary(ltsal);
                    System.out.println();
                    System.out.println("Your Name is " + lt.getName());
                    System.out.println("Your Age is " + lt.getAge());
                    System.out.println("Your Address is " + lt.getAddress());
                    System.out.println("Your E-mail Address is " + lt.getEmail_Address());
                    System.out.println("Your ID is " + lt.getLecturerid());
                    System.out.println("Your rank is " + lt.getLtrank());
                    System.out.println("Your Salary after bonus is " + lt.getSalary());
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Welcome to Employee board");
                    Employee emp = new Employee();
                    System.out.println("Please enter your Name");
                    String empname = input.next();
                    emp.setName(empname);
                    System.out.println("Please enter your Age");
                    int empage = input.nextInt();
                    emp.setAge(empage);
                    System.out.println("Please enter your Address");
                    String empaddress = input.next();
                    emp.setAddress(empaddress);
                    System.out.println("Please enter your Email Address");
                    String empemail = input.next();
                    emp.setEmail_Address(empemail);
                    System.out.println("Please enter your ID");
                    int empid = input.nextInt();
                    emp.setEmpid(empid);
                    System.out.println("Please enter your rank");
                    String emprank = input.next();
                    emp.setRank(emprank);
                    System.out.println("Please enter your office number");
                    int empoffice = input.nextInt();
                    emp.setOffice(empoffice);
                    System.out.println("Please enter the date you were hired at.");
                    String datehired = input.next();
                    emp.setDate_Hired(datehired);
                    System.out.println("Please enter your salary");
                    double sal = input.nextDouble();
                    emp.setSalary(sal);
                    System.out.println();
                    System.out.println("Your Name is " + emp.getName());
                    System.out.println("Your Age is " + emp.getAge());
                    System.out.println("Your Address is " + emp.getAddress());
                    System.out.println("Your E-mail Address is " + emp.getEmail_Address());
                    System.out.println("Your id is " + emp.getEmpid());
                    System.out.println("Your Office number is " + emp.getOffice());
                    System.out.println("Your rank is " + emp.getRank());
                    System.out.println("You are hired since " + emp.getDate_Hired());
                    System.out.println("Your Salary after bonus " + emp.getSalary());
                    System.out.println();
                    break;
                case 4:
                    Department dep = new Department();
                    System.out.println("Welcome to Departments");
                    System.out.println("Please choose the specialization you want");
                    System.out.println("1." + dep.getPhy());
                    System.out.println("2." + dep.getChem());
                    System.out.println("3." + dep.getCs());
                    System.out.println("4." + dep.getMath());
                    System.out.println("5." + dep.getStat());
                    int y = input.nextInt();
                    switch (y) {
                        case 1:
                            System.out.println("Welcome to " + dep.getPhy());
                            Physics ph = new Physics(300, 2.3);
                            System.out.println("The capacity of physics department is " + ph.getDepartment_capacity());
                            System.out.println("The CGPA of physics department is " + ph.getDepartment_cgpa());
                            System.out.println("The Subjects of physics department are " + ph.getSubjects());
                            continue;
                        case 2:
                            System.out.println("Welcome to " + dep.getChem());
                            Chemistry ch = new Chemistry(500, 2.5);
                            System.out.println("The capacity of Chemistry department is " + ch.getDepartment_capacity());
                            System.out.println("The CGPA of Chemistry department is " + ch.getDepartment_cgpa());
                            System.out.println("The Subjects of Chemistry department are " + ch.getSubjects());
                            continue;
                        case 3:
                            System.out.println("Welcome to " + dep.getCs());
                            Computer_Science cs = new Computer_Science(50, 3.1);
                            System.out.println("The capacity of Computer Science department is " + cs.getDepartment_capacity());
                            System.out.println("The CGPA of Computer Science department is " + cs.getDepartment_cgpa());
                            System.out.println("The Subjects of Computer Science department are " + cs.getSubjects());
                            continue;
                        case 4:
                            System.out.println("Welcome to " + dep.getMath());
                            Mathematics math = new Mathematics(150, 2.0);
                            System.out.println("The capacity of Mathematics department is " + math.getDepartment_capacity());
                            System.out.println("The CGPA of Mathematics department is " + math.getDepartment_cgpa());
                            System.out.println("The Subjects of Mathematics department are " + math.getSubjects());
                            continue;
                        case 5:
                            System.out.println("Welcome to " + dep.getStat());
                            Statistics stat = new Statistics(100, 2.4);
                            System.out.println("The capacity of Statistics department is " + stat.getDepartment_capacity());
                            System.out.println("The CGPA of Statistics department is " + stat.getDepartment_cgpa());
                            System.out.println("The Subjects of Statistics department are " + stat.getSubjects());
                            continue;
                        default:
                            System.out.println("Invalid choice");
                            continue;
                    }
                case 5:
                    System.out.println("Welcome to SummerCourse section");
                    System.out.println("Please choose what you wish");
                    System.out.println("1.Available Subjects");
                    System.out.println("2.Fees");
                    System.out.println("3.Starting date");
                    int z = input.nextInt();
                    summercourse sc = new summercourse();
                    switch (z) {
                        case 1:
                            System.out.println("These are the subjects that are available");
                            System.out.println(sc.getSubjects());
                            continue;
                        case 2:
                            System.out.println("Fee per subject is " + sc.getCost());
                            continue;
                        case 3:
                            System.out.println("The Lectures starts at " + sc.getDate());
                            continue;
                        default:
                            System.out.println("Invalid choice");
                            continue;
                    }
                default:
                    System.out.println("Good Luck");
            }
        } while(x != 0);

    }
}
