package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility2 {
    public static void main(String[] args) {
       String[]student = {"Elif","Gunay","Cihad","David","James","Aaron"};

       String[]earlyBird = Arrays.copyOf(student,3);// copy the first 3 element from the arrays

        System.out.println(Arrays.toString(earlyBird));


        int[]numbers = {1,2,3,4,5,6,7,8,9,10};

        numbers= Arrays.copyOf(numbers,5); //after this line 16 array numbers have 5 elements

        System.out.println(Arrays.toString(numbers));
        System.out.println("------------------------------------------");

        char[]ch1 = {'A','B','C','D','E','F','G','H','I'};
        char []ch2 = Arrays.copyOfRange(ch1,3,6);

        System.out.println(Arrays.toString(ch2));

        System.out.println("---------------------------------");

        int []score = {10,20,23,12,32,45,43};
        int [] score2 = Arrays.copyOfRange(score,2,5);

        System.out.println(Arrays.toString(score2));
        System.out.println("--------------------------------");

        int[] score3 = Arrays.copyOfRange(score,5,score.length);

        System.out.println(Arrays.toString(score3));




    }
}
