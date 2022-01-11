package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your full name");
         String fullName = scan.nextLine(); //java programingEnter
        System.out.println("Enter your building number");
        String building = scan.next();//1344A
        scan.nextLine(); //Enter
        System.out.println("Enter your street name");
        String street = scan.nextLine();
        System.out.println("Enter your city name:");
        String city = scan.nextLine(); // McLeanEnter
        System.out.println("Enter your state name ");
        String state = scan.next(); // VAEnter
        System.out.println("Enter your zip code: ");
        String zipCode = scan.next();//22012
        scan.nextLine();
        System.out.println("Enter your country name:");
        String country = scan.nextLine();
        scan.close();












    }
}
