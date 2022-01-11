package day20_Arrays;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        // store the elements: 10;20;30;50

        int[]numbers = {10,20,30,50};//size:4
        System.out.println(Arrays.toString(numbers));

        System.out.println("--------------------------------------------------");
        //create a variable that can contain 5 scores

        int[]scores =new int[5]; //[0,0,0,0,0]
        scores[1]= 85;
        scores[scores.length-1]=95;
        scores[3]= 75;
        scores[2]= 55;
        scores[0]= 65;
        System.out.println(Arrays.toString(scores));
        System.out.println("--------------------------------------------------------");
        String[]month ={"January","February","March","April","May","June","July","August",
                "September","October","November","December" };
        for (int i = 0; i < month.length-1; i++) {
            System.out.println(month[i]);
        }










    }
}
