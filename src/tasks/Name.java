package tasks;

import java.util.Locale;
import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter first and last names");
        String firstName = scan.next();
        String lastName = scan.next();
        String f = firstName.substring(0,1).toUpperCase();
        String f1 = firstName.substring(1).toLowerCase();
        String l = lastName.substring(0,1).toUpperCase();
        String l1 = lastName.substring(1).toLowerCase();
        System.out.println(f+f1+" "+l+l1);













    }
}
