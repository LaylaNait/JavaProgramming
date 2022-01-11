package day01_JavaIntro;

import day24_CustomMethods_Return.ReturnMethodIntro;
import day24_CustomMethods_Return.ReturnMethodsPractice4;
import utilities.StringUtility;

public class test {
    public static void main(String[] args) {
String str = "java programming";
        String reversedName = ReturnMethodIntro.reverse(str);
        System.out.println(reversedName);
        String str1 = "Wooden Spoon";

        StringUtility.printEachChar(str);
        System.out.println("--------------------------------");


    }
}
