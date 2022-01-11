package day25_CustomeMethods_Overloading;

import utilities.StringUtility;

public class test {
    public static void main(String[] args) {
        String str = "Java Programming Language";

        StringUtility.printEachChar(str);
        String s1 = "Wooden Spoon";
        StringUtility.reverse(s1);
        System.out.println(s1);


        System.out.println("----------------------------------------------");
        String[]names = {"layla","alla", "mona","anna","doha"};
        int count =0;
        for (String each : names) {
            if(StringUtility.isPalindrome(each)){
                count++;
            }
        }
        System.out.println(count);
        System.out.println("_------------------------------------------------------");


    }
}
