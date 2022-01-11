package utilities;

import java.util.Arrays;

public class ArraysUtility {
    
  //prints each integer of an integer array in separate lines
  
  public static void printEachElement(int[]array){
      for (int each : array){
          System.out.println(each);
      }
  } 
    // print each double of double array in separate line
    
    public static void printEachElement (double []array){
        for (double each : array){
            System.out.println(each);
        }
    }
    
    
    // print each char of char array in separate line
    public static void printEachElement (char []array){
        for (char each : array){
            System.out.println(each);
        }
    }

    // print each String of String array in separate line
    public static void printEachElement (String []array){
        for (String each : array){
            System.out.println(each);
        }
    }

    // print the maximum number for integer array
    public static int max(int[] numbers){
        Arrays.sort(numbers);
        return numbers [numbers.length-1];
    }

    // print the maximum number for double array
    public static double max(double[] numbers){
        Arrays.sort(numbers);
        return numbers [numbers.length-1];
    }

    // print the minimum number from integer array
    public static int min (int[] numbers){
        Arrays.sort(numbers);
        return numbers [0];
    }
    // print the minimum number from double array
    public static double min (double[] numbers){
        Arrays.sort(numbers);
        return numbers [0];
    }
    
    
   // checks if the given integer is contained in the given array. returns boolean. contains(int [], int)
    public static boolean contains (int [] array, int element){
      boolean result = false;
        for (int each : array) {
            if(each == element){
                result = true;
            }
            
        }      
       return result; 
    }
    // checks if the given double is contained in the given array. returns boolean. contains(int [], int)
    public static boolean contains (double [] array, double element) {
        boolean result = false;
        for (double each : array) {
            if (each == element) {
                result = true;
            }

        }
        return result;
    }
    // checks if the given char is contained in the given array. returns boolean. contains(int [], int)
    public static boolean contains (char [] array, char element) {
        boolean result = false;
        for (char each : array) {
            if (each == element) {
                result = true;
            }

        }
        return result;
    }

    // checks if the given String is contained in the given array. returns boolean. contains(int [], int)
    public static boolean contains (String [] array, String element) {
        boolean result = false;
        for (String each : array) {
            if (each.equals(element)) {
                result = true;
            }

        }
        return result;
    }
    //adds the given element to array, returns a new array
    public static int[] addElement(int[] array, int element) {
        int[] result = new int[array.length + 1];
        int i = 0;
        for (int each : array) {
            result[i++] = each;

        }
        result[i] = element;
        return result;

    }
    //adds the given element to array, returns a new array
    public static double[] addElement(double[] array, double element) {

        double[] result = new double[array.length + 1];
        int i = 0;
        for (double each : array) {
            result[i++] = each;
        }
        result[i] = element;
        return result;
    }
    //adds the given element to array, returns a new array
    public static String[] addElement(String[] array, String element) {
        String[] result = new String[array.length + 1];
        int i = 0;
        for (String each : array) {
            result[i++] = each;
        }
        result[i] = element;
        return result;
    }
    //adds the given element to array, returns a new array
    public static char[] addElement(char[] array, char element) {
        char[] result = new char[array.length + 1];
        int i = 0;
        for (char each : array) {
            result[i++] = each;
        }
        result[i] = element;
        return result;
    }


    // returns the frequency of given element from the given array
    public static int  frequencyOfElements(int[]array, int element){
        int count = 0;
        for (int each : array) {
            if (each == element){
                count++;
            }
        }
        return count++;
    }
    // returns the frequency of given element from the given array
    public static int  frequencyOfElements(double[]array, double element){
        int count = 0;
        for (double each : array) {
            if (each == element){
                count++;
            }
        }
        return count++;
    }
    // returns the frequency of given element from the given array
    public static int  frequencyOfElements(char[]array, char element){
        int count = 0;
        for (char each : array) {
            if (each == element){
                count++;
            }
        }
        return count++;
    }
    // returns the frequency of given element from the given array
    public static int  frequencyOfElements(String []array, String element){
        int count = 0;
        for (String each : array) {
            if (each.equals(element)){
                count++;
            }
        }
        return count++;
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

    // removes the index from the array, return new array
    public static int[] removeElement(int[]array, int index){
        if (index<0 || index>array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }
        int []result = new int[array.length-1];
        int j =0;
        for (int i = 0; i < array.length; i++) {
            if (i == index){
                continue;// skip
            }
            result[j++] = array[i];
        }
        return result;
    }

    // removes the index from the array, return new array
    public static double[] removeElement(double[]array, double index){
        if (index<0 || index>array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }
        double []result = new double[array.length-1];
        int j =0;
        for (int i = 0; i < array.length; i++) {
            if (i == index){
                continue;// skip
            }
            result[j++] = array[i];
        }
        return result;
    }

    // removes the index from the array, return new array
    public static char[] removeElement(char[]array, int index){
        if (index<0 || index>array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }
        char []result = new char [array.length-1];
        int j =0;
        for (int i = 0; i < array.length; i++) {
            if (i == index){
                continue;// skip
            }
            result[j++] = array[i];
        }
        return result;
    }

    // removes the index from the array, return new array
    public static String[] removeElement(String[]array, int index){
        if (index<0 || index>array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }
        String []result = new String[array.length-1];
        int j =0;
        for (int i = 0; i < array.length; i++) {
            if (i == index){
                continue;// skip
            }
            result[j++] = array[i];
        }
        return result;
    }


    // merge the given arrays and returns the new array
    public static int []merge (int []arr1,int[]arr2){
        int []result ={};
        for (int each : arr1) {
            result = ArraysUtility.addElement(result,each);
        }
        for (int each : arr2) {
            result = ArraysUtility.addElement(result,each);

        }
        return result;
    }
    // merge the given arrays and returns the new array
    public static double[]merge (double[]arr1,double[]arr2){
        double[]result ={};
        for (double each : arr1) {
            result = ArraysUtility.addElement(result,each);
        }
        for (double each : arr2) {
            result = ArraysUtility.addElement(result,each);

        }
        return result;
    }
    // merge the given arrays and returns the new array
    public static char[]merge (char []arr1,char[]arr2){
        char []result ={};
        for (char each : arr1) {
            result = ArraysUtility.addElement(result,each);
        }
        for (char each : arr2) {
            result = ArraysUtility.addElement(result,each);

        }
        return result;
    }
    // merge the given arrays and returns the new array
    public static String[]merge (String []arr1,String[]arr2){
        String []result ={};
        for (String each : arr1) {
            result = ArraysUtility.addElement(result,each);
        }
        for (String each : arr2) {
            result = ArraysUtility.addElement(result,each);

        }
        return result;
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




    // replace all the matching old values of the array with the new value
    public static int[]replaceAll(int[]array, int oldValue , int newValue){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldValue){
                array[i]= newValue;
            }

        }
        return array;
    }
    // replace all the matching old values of the array with the new value
    public static double[]replaceAll(double[]array, double oldValue , double newValue){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldValue){
                array[i]= newValue;
            }

        }
        return array;
    }
    // replace  all the matching old values of the array with the new value
    public static char[]replaceAll(char[]array, char oldValue , char newValue){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldValue){
                array[i]= newValue;
            }

        }
        return array;
    }
    // replace  all the matching old values of the array with the new value
    public static String[]replaceAll(String[]array, String oldValue , String newValue){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldValue){
                array[i]= newValue;
            }

        }
        return array;
    }



    //removes the duplicates from the given array, returns the new array
    public static int[] removeDuplicates(int[] array){

        int[] result = {};//{1,

        for (int each : array) {
            if(!ArraysUtility.contains(result, each)){
                result = ArraysUtility.addElement(result, each);
            }
        }

        return result;
    }

    //removes the duplicates from the given array, returns the new array
    public static double[] removeDuplicates(double[] array){

        double[] result = {};//{1,

        for (double each : array) {
            if(!ArraysUtility.contains(result, each)){
                result = ArraysUtility.addElement(result, each);
            }
        }

        return result;
    }

    //removes the duplicates from the given array, returns the new array
    public static char[] removeDuplicates(char[] array){

        char[] result = {};//{1,

        for (char each : array) {
            if(!ArraysUtility.contains(result, each)){
                result = ArraysUtility.addElement(result, each);
            }
        }

        return result;
    }

    //removes the duplicates from the given array, returns the new array
    public static String[] removeDuplicates(String[] array){

        String[] result = {};//{1,

        for (String each : array) {
            if(!ArraysUtility.contains(result, each)){
                result = ArraysUtility.addElement(result, each);
            }
        }

        return result;
    }







    }
