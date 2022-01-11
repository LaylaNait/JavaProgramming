package day15ForLoop;

import java.util.Scanner;

public class FormatFullName {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter first and last names");
        String firstName = scan.next();
        String lastName = scan.next();
       // String f = firstName.substring(0,1).toUpperCase();
        //String f1 = firstName.substring(1).toLowerCase();
        //String l = lastName.substring(0,1).toUpperCase();
      //  String l1 = lastName.substring(1).toLowerCase();
       // System.out.println(f+f1+" "+l+l1);

     // firstName = firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase();

        firstName = (firstName.charAt(0)+"").toUpperCase()+ firstName.substring(1).toLowerCase();
        lastName =(""+lastName.charAt(0)).toUpperCase()+ lastName.substring(1).toLowerCase();
        String fullName = firstName + " "+ lastName;
        System.out.println(fullName);








    }
}
/*
write a program that asks user to enter first and last names, and then prints the full name in regular
format (first character in uppercase )
       input:
          firstname = "cyDEo"
          lastname = "SCHOol"
          output = "Cydeo School"
 */