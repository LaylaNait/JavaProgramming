package tasks;

import java.util.Arrays;

public class CustomMethods {

    public static void main(String[] args) {

      int[] arr1 ={3,5,8,1} ;
      int[]arr2 = {5,6,10};
        System.out.println(Arrays.toString(arr(arr1,arr2)));


    }
public  static int []arr (int[] arr1, int[] arr2){

        int[] newArr=new int[arr1.length+arr2.length];
        int i=0;
        for (int each : arr1) {
            newArr[i++]=each;
        }
        for (int each : arr2) {
            newArr[i++]=each;
        }
        return  newArr;

}


 }
/*
1. create a method that can merge two integer arrays.
       merger(int[] arr1, int[] arr2)

 */