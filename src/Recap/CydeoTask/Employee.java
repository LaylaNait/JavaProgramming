package Recap.CydeoTask;

public class Employee  extends Person{

  private int employeeID;
  private String jobTitle;
  private double salaryName;

    public Employee(String name, int age, char gender, int employeeID, String jobTitle, double salaryName) {
        super(name, age, gender);
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        this.salaryName = salaryName;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalaryName() {
        return salaryName;
    }

    public void setSalaryName(double salaryName) {
        this.salaryName = salaryName;
    }


    public void work(){
        System.out.println(getName()+" is working");

    }


    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", employeeID=" + employeeID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salaryName +
                '}';
    }

}
