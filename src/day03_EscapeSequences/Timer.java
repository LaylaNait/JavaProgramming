package day03_EscapeSequences;

import java.util.Scanner;

public class Timer {

    public static void main(String[] args) throws InterruptedException {

        Scanner scan=new Scanner(System.in);
        System.out.println("please enter the number of minutes");
        int minutes=scan.nextInt();
        scan.close();

        for (int i=minutes; i > 0 ;--i) {
            if( i< 0 ) {
                break;
            }
            for (int z=59; z >=0 ; --z) {
                System.out.print("\r"+ (i-1)+" minutes and "+z+" seconds left");
                Thread.sleep(1000);  // pauses the execution of the code for given milli seconds
            }
        }

        System.out.println("\n\n");

        System.err.println("\t\t\t* * * * * * * * * * * * * * * * * * * * * * * * * *");
        System.err.println("\t\t\t*                                                 *");
        System.err.println("\t\t\t*       Times is Up, Please take your seats!      *");
        System.err.println("\t\t\t*                                                 *");
        System.err.println("\t\t\t* * * * * * * * * * * * * * * * * * * * * * * * * *");

    }

    public static class Println_VS_Print {

        public static void main(String[] args) {
            System.out.println("Hello Cydeo");
            System.out.println("How are you all today");
            System.out.println("_____________________");
            System.out.print("Hello Cydeo");
            System.out.print(" how are you today?");
            System.out.println(" Java programming ");
            System.out.print(" woden spoon");










        }





    }
}
