package tasks.stateTask;

public class StatesObject {
    public static void main(String[] args) {
     California california = new California("Triplex", "Gavin Newsom",
             "Alex Padilla", 12.3,39000000 );

   Florida florida=new Florida("Republican","Ron DeSantis","Marco Rubio",
           6,21000000);

  Virginia virginia=new Virginia("Republican","Warner",
          "Tim Kaine",3.5,8670000);

   Texas texas = new Texas("Green", "Greg Abbot", "Ted Cruz", 6.25,9800000 );

        System.out.println(texas.getSenator());
        System.out.println(virginia.getName());
        System.out.println(california);

    }
}
/*

Create a class named StateObjects
					Create the objects of each sub classes

					test all the functions of each objects

            		Analyze the relationships between the classes

 */