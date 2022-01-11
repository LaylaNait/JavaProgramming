package day10_NestedIf;

public class CharacterIdentity {
    public static void main(String[] args) {

        char ch = 7;
       if(ch >=0&& ch<=9){//(ch >='a' && ch <= 'z' || ch>= 'A' && ch<= 'Z')
           System.out.println("digit Character");

       }else if (ch>= 65 && ch<=122) {
            System.out.println("alphabetic Character");

        }else{
            System.out.println("special character");

        }











    }
}
/*
create a class called Character Identity, and write a program that can identify if the given character is
a digit or alphabetic Character (A~Z or a~z ) or a special character.
           ex:
           ch:'@'
           output:special character

 */