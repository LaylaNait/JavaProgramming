package day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {

       //create a variable that's capable enough to contain 5 names

        //System.out.println(myGroup); // hashcode
        String[] myGroup = new String[5]; // if we know how many element but we don't know there names
        myGroup[0]= "Guana";
        myGroup[1]=  "Layla";
        myGroup[2]= "Mustapha";
        myGroup[3]= "Hulya";
        myGroup[4]="Idriss";
        System.out.println(Arrays.toString(myGroup)); //["Guana","Layla","Mustapha","Hulya","Idriss"]

        System.out.println("-------------------------------------------------------------");
        String[] days = {"Monday", "Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        //                 0           1       2           3          4        5         6
        System.out.println(Arrays.toString(days));
        int number = 1;

        if (number<1 || number>7){
            System.err.println("Invalid Number");
            System.exit(0);
        }

        System.out.println(days[number-1]);// index number of the element








    }
}
