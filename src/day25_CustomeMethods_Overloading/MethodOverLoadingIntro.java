package day25_CustomeMethods_Overloading;

import java.util.Arrays;

public class MethodOverLoadingIntro {
    public static void main(String[] args) {

        int[] intArray = {5,6,0,-1,3,4};
        Arrays.sort(intArray);
        double [] doubleArray = {10.5,11,5,5, 4,5};
        Arrays.sort(doubleArray);

        char [] charArray = {'A','B','E','S'};
        Arrays.sort(charArray);

        sumOfNumbers(10,20,40,30);
        int sum1 = sumOfNumbers(10,20);
        double sum2 = sumOfNumbers(10,30,20);
        double sum3 = sumOfNumbers(10,4,4.5,2.5);
        System.out.println(sum3);




    }

    public static int sumOfNumbers(int num1,int num2){  return num1+num2;}
    public static double sumOfNumbers (double num1,double num2){
        return num1+num2;
    }
    public  static double sumOfNumbers (double num1,double num2 ,double num3){return num1+num2+num3;}
    public static int sumOfNumbers(int num1,int num2, int num3){return sumOfNumbers(num1,num2)+num3;}
    public static int sumOfNumbers(int num1,int num2, int num3,int num4){return num1+ num2+num3+ num4;}
    public static double sumOfNumbers(double num1,double num2 ,double num3,double num4){return num1+num2+num3+num4;}


}
