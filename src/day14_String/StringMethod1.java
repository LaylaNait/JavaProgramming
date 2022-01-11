package day14_String;

public class StringMethod1 {
    public static void main(String[] args) {

        String str1 = "    batch 25       ";
         str1 = str1.trim();// remove spaces before and after the character not between character
        System.out.println(str1);
        String str2 = "Cydeo School";
        int n1 = str2.indexOf("h");//8
        System.out.println("n1 = " + n1);
        int n2 = str2.indexOf("ool"); //9
        System.out.println("n2 = " + n2);
        String str3 = "java programming";
        int n3 = str3.indexOf("amm"); //10
        System.out.println("n3 = " + n3);
        int n4 = str3.indexOf("gu");
        System.out.println("n4 = " + n4);
        System.out.println("-------------------------------------");

        String s = "Java Nova Cava Wawa orange";
        int firstA = s.indexOf("a");
        int lastA = s.lastIndexOf("a");
        int secondA = s.indexOf("a ");
        int thirdA = s.indexOf("a C");
       // int fourthA = s.indexOf("ava W");
        int  fourthA = s.indexOf("Ca")+1; //another way to find index number of a fourthA
       // int fourthA = s.lastIndexOf("av");
        int fifthA = s.indexOf("va W");

        System.out.println("firstA = " + firstA);
        System.out.println("secondA = " + secondA);
        System.out.println("thirdA = " + thirdA);
        System.out.println("fourthA = " + fourthA);
        System.out.println("fifthA = " + fifthA);
        System.out.println("lastA = " + lastA);





    }
}
