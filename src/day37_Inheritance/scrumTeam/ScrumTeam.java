package day37_Inheritance.scrumTeam;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

   public ProductOwner PO;
   public BusinessAnalyst BA;
   public ScrumTeam SM;

   public ArrayList<Tester> testers = new ArrayList<>();
   public ArrayList<Developer> developers = new ArrayList<>();
   public ScrumTeam(ProductOwner PO,BusinessAnalyst BA,ScrumMaster SM){

   }
   public void addTester(Tester tester){
      testers.add(tester);
   }
   public void addTesters(Tester[]testersArr){
      testers.addAll(Arrays.asList(testersArr));
   }
   public void removeTester(int id){
      testers.removeIf(p -> p.id==id);
   }
   public void addDeveloper(Developer developer){
      developers.add(developer);
   }
   public void addDevelopers(Developer[]developersArr){
      developers.addAll(Arrays.asList(developersArr));
   }
   public void removeDeveloper(int id){
      developers.removeIf(p -> p.id==id);
   }

   public String toString() {
      return "ScrumTeam{" +
              "PO=" + PO.name +
              ", BA=" + BA.name +
              ", SM=" + SM+
              ", number of testers=" + testers +
              ", number of developers=" + developers +
              '}';
   }
}
