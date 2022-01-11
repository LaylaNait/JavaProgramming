package day12_Scanner;

import java.util.Scanner;

public class NextLinePractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = input.nextInt();
        System.out.println("Enter your full name");
        String fullName = input.nextLine();
        input.nextLine();// because there is an Enter key left in the scanner

        System.out.println("age = " + age);
        System.out.println("fullName = " + fullName);
        input.close();







    }
}
