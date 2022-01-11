package day15ForLoop;

import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        int min = 2147483647;// any number that user entered will be less than 2147483647
        for (int i = 10; i <15; i++){
            System.out.println("Enter a number");
            int num = scan.nextInt();// if user enter 6 if 6< min 6 will be asigne to min=6 for 2end time
                                     //user enter 30, 30 is not greater than 6 it will not be executed
                                     // if user enter -5<6 min=-5 -5 will be executed
            if (num <min){
                min = num;
            }
        }
        System.out.println("min = " + min);






          scan.close();



    }
}
