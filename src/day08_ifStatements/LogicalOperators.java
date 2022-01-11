package day08_ifStatements;

public class LogicalOperators {
    public static void main(String[] args) {
        String name = "steven";
        int age = 19;
        String citizen = "Uk";
        boolean isEligible = age >= 18 && citizen == "USA";
        // true && false ==> false


        System.out.println(name+ "is eligible to vote: " + isEligible);
        System.out.println("------------------------------------------");
        String name2 = "josh";

        int creditScore = 720;
        int age2 = 23;
        int income = 40000;
        boolean isEligible2 = creditScore >=700 && age2 >= 21 && income >= 60000;
        System.out.println(name2 +"is eligible for loan: "+ isEligible2 );
        System.out.println("________________________________________________");

        String name3 = "Shay";
        int age3 = 21;
        char gender = 'F';

        boolean isEligible3 = age3 >= 18 && (gender =='M' || gender == 'F' );
        System.out.println(name3+ " is eligible to register: "+ isEligible3);
        System.out.println("-------------------------------------------");
        String name4 = "James";
        String countryOfBirth = "UK";
        boolean marriedToUSCitizen = false;

        boolean isEligible4 = countryOfBirth == "USA"|| marriedToUSCitizen == true;
        System.out.println(name4 + " is eligible to apply for citizenship " + isEligible4 );


        String student = "Anna";
        double gpa = 3.5;
        int familyIncome = 100000;
         boolean isEligible5 = gpa >=3.5 || familyIncome <= 60000;
        System.out.println(student+ " is eligible for scholarship: "+ isEligible5);











    }



}
