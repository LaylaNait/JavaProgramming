package day37_Inheritance.scrumTeam;

public class Employee extends Person {
    public Employee(String name, int age, char gender, String jobTitle, int id, double salary, String companyName) {
        super(name, age, gender);
        this.jobTitle = jobTitle;
        this.id = id;
        this.salary = salary;
        this.companyName = companyName;
    }

    public String jobTitle;
    public int id;
    public double salary;
    public String companyName;





    public void work() {
        System.out.println(jobTitle + " " + name + "is working");
    }


    public String toString() {
        return "Employee{" +
                ", name='" + name + '\'' +
                '}';

    }
}