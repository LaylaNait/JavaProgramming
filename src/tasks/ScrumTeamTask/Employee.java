package tasks.ScrumTeamTask;

public class Employee extends Person {
    private int ID;
    private String jobTitle;
    private double salary;


    public Employee(String name, int age, char gender, int ID, String jobTitle, double salary) {
        super(name, age, gender);
        setID(ID);
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void work(){
        System.out.println( getJobTitle() +" "+ getName()+ " is working ");
    }

    public String toString() {
        return "Employee{" +
                "name='" + getName()+ '\'' +
                ", age=" + getAge()+
                ", gender=" + getGender() +
                ", ID=" + ID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}






/*
 Create a sub class of Person named Employee
			Extra variables:
				id, jobTitle, salary

			Extra methods:
				SetInfo(): sets the name, age, gender, id, jobTitle and salary of Employee Object
							Hint: after creating setInfo method of employee class,
							you can call the inheritend setInfo() to set the name, age, and gender

				work()

				toString(): generate toString seperately in Employee class so that name, age, gender, id,
				 jobTitle and salary of the emplyee can be displayed
 */