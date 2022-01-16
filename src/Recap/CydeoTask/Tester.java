package Recap.CydeoTask;

public class Tester extends Employee{

    public Tester(String name, int age, char gender, int employeeID, String jobTitle, double salaryName) {
        super(name, age, gender, employeeID, jobTitle, salaryName);
    }

    public void createTicket(){
        System.out.println(getJobTitle() +" "+getName()+" is creating ticket");
    }


}
/*
3. Create a sub class of Employee named Tester
            Override the work method
            Extra methods:
                createTicket()
*/
