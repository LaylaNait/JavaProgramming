package tasks.ScrumTeamTask;

import java.util.Arrays;

public class AmazonInc {
    public static void main(String[] args) {

  ProductOwner PO = new ProductOwner("Ihab",34,'M',45,150000);
  ScrumMaster SM = new ScrumMaster("Ilya",38,'F',11,80000);
  BusinessAnalyst BA = new BusinessAnalyst("Layla",29,'F',44,130000);

  Tester tester1 = new Tester("Layla",29,'F',"QA",87,160000);
  Tester tester2 = new Tester("Mohamed",45,'M',"Insurance quality",44,123000);
  Tester tester3 = new Tester("John",29,'M',"QA",57,120000);
  Tester tester4 = new Tester("Albert",43,'M',"QA",40,110000);

  Tester []testers = {tester1,tester2,tester3,tester4};

  Developer developer1 = new Developer("Ahmet",38,'M',33,"Java developer",150000);
  Developer developer2 = new Developer("Anna",23,'F',13,"Java developer",135000);
  Developer developer3 = new Developer("Ahmet",38,'M',33,"Java developer",150000);
  Developer developer4 = new Developer("Walid",39,'M',33,"Java developer",150000);

  Developer [] developers ={developer1,developer2,developer3,developer4};
  ScrumTeam scrumTeam = new ScrumTeam(PO,BA,SM);

  scrumTeam.addDevelopers(developers);
  scrumTeam.addTester(testers);
      System.out.println(scrumTeam);

      for (Tester each : scrumTeam.testers) {
        System.out.println(each.getName()+ " get paid yearly:  " +each.getSalary());
      }





    }
}
/*
 Create a class named AmazonInc:

			create the objects of ProductOwner, ScrumMaster, and BusinessAnalyst
			Create 4 objects of Testers
			Create 5 Objects of Developers

			Create an object of ScrumTeam

			Add the ProductOwner, ScrumMaster, and BusinessAnalyst, Testers and Developers object into the scrum team


 */