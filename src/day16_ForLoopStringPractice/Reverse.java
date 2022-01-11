package day16_ForLoopStringPractice;

public class Reverse {
    public static void main(String[] args) {

        String str = "Wooden Spoon";
        // indexN     0123456789...
        String result = ""; //contain the reversed version of str
        // noops nedoow
        
        /*
        result += str.charAt(11);//n
        result += str.charAt(10);//o
        result += str.charAt(9);//o
        result += str.charAt(8);//p
        result += str.charAt(7);//s
        result += str.charAt(6);//space
        result += str.charAt(5);//n
        result += str.charAt(4);//e
        result += str.charAt(3);//d
        result += str.charAt(2);//o
        result += str.charAt(1);//o
        result += str.charAt(0);//w
         */

        for (int i = str.length()-1; i >=0 ; i--) {// i index number of str(starting last index to index 0)
           result += str.charAt(i);
        }
        System.out.println(result);



        






/* Write a program that can reverse any given string

			Ex:
				input:
					Wooden Spoon

				output:
					noopS nedooW

 */

    }
}
