package tasks.ScrumTeamTask;

public class BusinessAnalyst extends Employee {

    public BusinessAnalyst(String name, int age, char gender, int ID, double salary) {
        super(name, age, gender, ID, "BA", salary);
    }

public void analyse(){
    System.out.println(getName()+" is analysing documents ");
}



}
