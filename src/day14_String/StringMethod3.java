package day14_String;

public class StringMethod3 {
    public static void main(String[] args) {
      //substring(beginning index, ending index )
        String word = "Cydeo School";
                    // 0123456789...
        String brand = word.substring(0,4+1);
        System.out.println("brand = " + brand);

        String str = word.substring(6); // we don't have to give the ending index because we are
                                        // creating the substring until end of the string
        System.out.println("str = " + str);

        String word2 = "java programming language";

        String s1 = word2.substring(0,word2.indexOf(" "));//java
        String s2 =  word2.substring(word2.indexOf(" ")+1,word2.lastIndexOf(" "));//programing
        String s3 = word2.substring(word2.lastIndexOf("")+1);//language

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);













    }
}
