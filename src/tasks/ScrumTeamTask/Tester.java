package tasks.ScrumTeamTask;

public class Tester extends Employee{


    public Tester(String name, int age, char gender, String jobTitle ,int ID, double salary) {
        super(name, age, gender, ID, jobTitle, salary);
    }

   public void createTicket(){
       System.out.println(getJobTitle()+ " "+getName()+ " is creating ticket");
   }

    @Override
    public void work() {
        System.out.println(getJobTitle()+" "+ getName()+ " is testing the application");
    }
}
/*
Create a sub class of Employee named Tester:

			Add any extra variable or method that Tester object need to have

 */