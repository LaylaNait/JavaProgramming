package tasks.ScrumTeamTask;

public class Developer extends Employee {

    public Developer(String name, int age, char gender, int ID, String jobTitle, double salary) {
        super(name, age, gender, ID, jobTitle, salary);
    }

    public void fixingBugs(){
     System.out.println(getName()+" is fixing bugs" );
 }


}
/*

 */