package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class UniqueElements {
    public static void main(String[] args) {
       int [] arr2 = {3,5,5,5,3,7,8,3,8};
       int [] n = uniqueElements(arr2);
        System.out.println(Arrays.toString(n));
        double []arr3 = {1.3,5.5,6.1,1.3,5.5,7.4,};
        double[]n1 = uniqueElements(arr3);
        System.out.println(Arrays.toString(n1));
    }
    // returns the unique element of the array as a new array
    public static int[] uniqueElements(int[] array) {
        int []result = {};
        for (int each : array) {
            if(ArraysUtility.frequencyOfElements(array,each)==1){
               result = ArraysUtility.addElement(result,each);
            }
        }
     return result;
    }
    // returns the unique element of the array as a new array
    public static double[] uniqueElements(double[] array) {
        double[]result = {};
        for (double each : array) {
            if(ArraysUtility.frequencyOfElements(array,each)==1){
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }
    // returns the unique element of the array as a new array
    public static char[] uniqueElements(char[] array) {
        char []result = {};
        for (char each : array) {
            if(ArraysUtility.frequencyOfElements(array,each)==1){
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }
    // returns the unique element of the array as a new array
    public static String[] uniqueElements(String[] array) {
        String []result = {};
        for (String each : array) {
            if(ArraysUtility.frequencyOfElements(array,each)==1){
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

}