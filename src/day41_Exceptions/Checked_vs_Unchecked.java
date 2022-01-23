package day41_Exceptions;

import day31_Constructors.Student;

public class Checked_vs_Unchecked {
    public static void main(String[] args) {

        //1** unchecked exception
        int a =10;
        int b = 0;
        //System.out.println(a/b);
      //  System.out.println("Wooden spoon");


     char[] characters = {'A','B','C'};
       // System.out.println(characters[99]); exception index out of bound

        Student student = null;
       // System.out.println(student.name);


     //2** checked exception

        System.out.println("Hello");

        //   Thread.sleep(3000); // checked

        System.out.println("Cydeo");


        // FileInputStream file = new FileInputStream("path of the file"); checked exception

        System.out.println("Java".charAt(1000)); // unchecked

    }
}
