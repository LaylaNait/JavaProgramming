package day25_CustomeMethods_Overloading;

import java.util.Arrays;

public class AddElementToArray_Overloading {

    public static void main(String[] args) {
        int []numbers = {1,4,5,10,3}; //7

      numbers =  addElement(numbers,7) ;

        char []chars = {'A','B','C'};
       chars = addElement(chars,'E');

        String[]names ={"ahmet","layla","mona"};
        names = addElement(names,"Idriss");


        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(chars));
        System.out.println(Arrays.toString(names));



    }





    public static int[] addElement(int[] array, int element) {
        int[] result = new int[array.length + 1];
        int i = 0;
        for (int each : array) {
            result[i++] = each;

        }
        result[i] = element;
        return result;

    }
    public static double[] addElement(double[] array, double element) {

        double[] result = new double[array.length + 1];
        int i = 0;
        for (double each : array) {
            result[i++] = each;
        }
        result[i] = element;
        return result;
    }
    public static String[] addElement(String[] array, String element) {
        String[] result = new String[array.length + 1];
        int i = 0;
        for (String each : array) {
            result[i++] = each;
        }
        result[i] = element;
        return result;
    }
    public static char[] addElement(char[] array, char element) {
        char[] result = new char[array.length + 1];
        int i = 0;
        for (char each : array) {
            result[i++] = each;
        }
        result[i] = element;
        return result;
    }
}
