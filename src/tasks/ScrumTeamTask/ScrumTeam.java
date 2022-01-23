package tasks.ScrumTeamTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {
  public ProductOwner PO; //  custom class ProductOwner can be the datatype of the variable PO
  public  BusinessAnalyst BA;
  public ScrumMaster SM;

  public ArrayList<Tester> testers = new ArrayList<>();
  public ArrayList<Developer> developers = new ArrayList<>();

  public ScrumTeam(ProductOwner PO, BusinessAnalyst BA, ScrumMaster SM) {
    this.PO = PO;
    this.BA = BA;
    this.SM = SM;
  }

  public void addTester(Tester[] testers){

  this.testers.addAll(Arrays.asList(testers));
}

public void addTesters(Tester[] testers){
    this.testers.addAll(Arrays.asList(testers));// i must use the "this" keyword to call the instance variable
                                                  // because the variable name of array is the same name of the array list
}

public void removeTester(int id){
    testers.removeIf(p -> p.getID() == id );
}
public void addDeveloper(Developer developer){
    developers.add(developer);
}
 public void addDevelopers (Developer []developers){
      this.developers.addAll(Arrays.asList(developers));
 }
 public  void removeDeveloper(int id){
      developers.removeIf(p->p.getID()==id);
 }

    public String toString() {
        return "ScrumTeam{" +
                "PO is " + PO.getName() +
                ", BA is " + BA.getName() +
                ", SM is " + SM.getName() +
                ", number of testers " + testers.size() +
                ", number of developers " + developers.size() +
                '}';
    }
}



/*
. Creat a class named ScrumTeam:
			Variables:
				PO (ProductOwner), BA (BusinessAnalyst), SM (ScrumMaster),
				testers (ArrayList<Testers>),  developers (ArrayList<Developers>)

			Methods:
				addTester(Tester tester): adds the given tester to testers arraylist

				addTesters(Tester[] testers): adds the given testers to testers arraylist

				removeTester(int id): removes the tester with the given id from the arraylist of tester

				addDeveloper(Developer developer): adds the given developer to testers arraylist

				addDeveloper(Developer[] developer): adds the given developers to testers arraylist

				removeDeveloper(int id): removes the developer with the given id from the arraylist of developer

				toString(): displays the BA' name, SM' name, PO' name, number of testers and number of developers

 */