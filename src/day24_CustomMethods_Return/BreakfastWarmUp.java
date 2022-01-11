package day24_CustomMethods_Return;

public class BreakfastWarmUp {
    public static void main(String[] args) {
        initials("layla","Nait");
        domain("layla.biologie@gmail.com");
        System.out.println("-------------------------------");
        String[] emails = {"josh@gmail.com","jimy@yahoo.com","gulsen@email.com","Elminir@gmail.com"};
        for (String email : emails) {
            
        }
    }
    //1. create a method that can display the initial of the person. initials()
    public static void initials(String firstName, String lastName){
        String initial = firstName.charAt(0)+"."+lastName.charAt(0);
        initial = initial.toUpperCase();
        System.out.println(initial);
    }
    //2. create a method that can desplay tha domain of the email. domain(String email)
    public static void domain(String email){
        String domain = email.substring(email.indexOf("@")+1,email.lastIndexOf("."));
        System.out.println("domain = " + domain);
    }
    //3. Create a method that can display the name of the month based on the given number to the method
    public static void nameOfMonth(int number){
        String name = "";
        if (number>=1 && number<= 12){
            name = (number ==1)?"Jan":(number == 2)?"Feb":(number ==3)?"mar":(number == 4)?"Apr":
                    (number ==5)?"May":(number==6)?"jun" :(number==7)?"jul" :(number ==8)?"Aug"
                            :(number ==9)?"Sep" :(number ==10)?"Oct":(number == 11)?"Nov": "Dec";
        }else {
            name = "Invalid";
        }

    }
    //4.Create a method that can print the name of the day based on the given number to the method
    //5. Create a method that can print how many days a month has


    // ageGroup()
    /*
     Create a class called AgeGroups, and write a program that can define the age groups of a person

          age groups are:
         infant (1 - 2), Toddler (3 - 5),Kid (6 - 9), Pre-Teen (10 - 12),
         Teenager (13 - 17),Young Adult (18 - 20),Adult (21 - 39),
         Young Middle-Aged Adult (40 - 49),Middle-Aged Adult (50 - 54),
         Very Young Senior Citizen (55 - 64),Young Senior Citizen (65 - 74),
         Senior Citizen (75 - 84),
        Old Senior Citizen (85+)

     */
}
