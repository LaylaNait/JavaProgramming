package day11_Switch_Scanner;

public class NumberToWords {
    public static void main(String[] args) {

        /*
        Write a program that can convert numbers 0~9 to words.

    NOTE: MUST use ternary
         */

        int number = 7;

        String result = (number>=0 && number<= 9 )?
                (number ==0 )? "Zero" :(number ==1)? "One" :(number ==2)?"Two"  :(number ==3)? "Tree"
                        :(number ==4)? "Four" :(number ==5)? "Five" :(number ==6)? "Six" :(number ==7)? "Seven"
                        :(number ==8)? "Eight": "nine"
                        :"Invalid Number";
        System.out.println("result = " + result);

        System.out.println("------------------------------------------------");


        boolean X = true;
        boolean Y = !X== false;
        boolean Z = Y;
        if (X){
            System.out.println("ddd");
        }
        if (Y){
            System.out.println("ccc");
        }
        if (Z){
            System.out.println("sss");
        }












    }
}
