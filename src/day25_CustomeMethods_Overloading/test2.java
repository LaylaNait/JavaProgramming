package day25_CustomeMethods_Overloading;

import utilities.ArraysUtility;

public class test2 {
    public static void main(String[] args) {

        int[]arr1 = {1,2,3,4,5};
        ArraysUtility.printEachElement(arr1);
        System.out.println("--------------------------------");
       double []arr2 = {1.5,2.3,3.5};
       ArraysUtility.printEachElement(arr2);
        System.out.println("----------------------------------");
        char[] arr3 = {'A','B','C','D'};
        ArraysUtility.printEachElement(arr3);
        System.out.println("-------------------------------------");

        int[]n1 ={1,7,3,10};
        int max1 =  ArraysUtility.max(n1);
        System.out.println(max1);

      double[]n2 = {2.5,5.3,6.5,20.1};
       double max2 = ArraysUtility.max(n2);
        System.out.println(max2);
        System.out.println("-----------------------------------");
        int[]a1 = {1,2,3,4,5};
       boolean r1 = ArraysUtility.contains(a1,5);
        System.out.println("r1 = " + r1);
    }
}
