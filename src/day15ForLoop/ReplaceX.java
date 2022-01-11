package day15ForLoop;

import java.util.Scanner;

public class ReplaceX {
    public static void main(String[] args) {
        System.out.println("enter a word");
        String word =new Scanner(System.in).next();//if i just getting one input i don't need scanner variable
        if (word.charAt(0) == 'x'){
           word =  word.replace('x','a');
        }
        System.out.println(word);

        System.out.println("-----------------------------------------------------------");
        String str = "xcodeX";
       String result = str.replace("x","a").replace("X","a");
        System.out.println(result);










    }
}
/*
write a program that ask the user to enter a word. if the word starts with x, replace it with a.
         input:
             xcodex
        output:
             acodex
task 2 : write a program that asks user to enter a word. and replace all the x or X with character a
         input:
              xcodeX
         output:
              acodea
 */