package day26_CustomMethodsPractice;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr ={12,13,14,15};
       int []r = reverseArray(arr);
        System.out.println(Arrays.toString(r));

    }
   // reverse the given array, returns a new array
   public static int[] reverseArray (int[]array){
        int[] result =new int [array.length];
        int j = 0;
       for (int i = array.length-1; i >=0 ; i--) {
           result[j++] = array[i];
       }
       return result;
   }

    // reverse the given array, returns a new array
    public static double[] reverseArray (double[]array){
        double[] result =new double[array.length];
        int j = 0;
        for (int i = array.length-1; i >=0 ; i--) {
            result[j++] = array[i];
        }
        return result;
    }

    // reverse the given array, returns a new array
    public static char[] reverseArray (char[]array){
        char[] result =new char [array.length];
        int j = 0;
        for (int i = array.length-1; i >=0 ; i--) {
            result[j++] = array[i];
        }
        return result;
    }

    // reverse the given array, returns a new array
    public static String[] reverseArray (String[]array){
        String[] result =new String[array.length];
        int j = 0;
        for (int i = array.length-1; i >=0 ; i--) {
            result[j++] = array[i];
        }
        return result;
    }
}
