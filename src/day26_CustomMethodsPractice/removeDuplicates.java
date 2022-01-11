package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class removeDuplicates {
    public static void main(String[] args) {

       int []arr = {3,3,10,5,7,1,9,9,5,4} ;
      int []r = removeDuplicates(arr);
        System.out.println(Arrays.toString(r));

    }



    public static int[] removeDuplicates(int[] array){
        int[] result = {};
        for (int each : array) {
            if (!(ArraysUtility.contains(array,each))){
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }








}


