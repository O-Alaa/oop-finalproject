import java.util.Scanner;
public class Person {
    Scanner Input = new Scanner(System.in);
    private String name;
    private int age;
    private String Address;
    private String Email_Address;
    private double salary;

    public Person() {
    }

    public Person(String name,int age, String Address, String Email_Address, double salary) {
        this.name = name;  
        this.age = age;
        this.Address = Address;
        this.Email_Address = Email_Address;
        this.salary = salary;
    }

   

    public void setName(String name) {
        this.name = name;
    }

     public String getName() {
        return name;
    }
     
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    
    public void setAddress(String Address) {
        this.Address = Address;
    }
    public String getAddress() {
        return Address;
    }

    public void setEmail_Address(String Email_Address) {
        this.Email_Address = Email_Address;
    }

    public String getEmail_Address() {
        return Email_Address;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    

    public double getSalary() {
        return salary;
    }

  
    }
    
    

