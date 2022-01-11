package day09_IfStatements;

public class medianNumber {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        int c = 20;
        boolean aIsMedianN = c<a && b>a || b<a && c>a;
        boolean bIsMedianN = a<b && c>b || c<b && a>b;
        boolean cIsMedianN = a>c && b<c || a<c && b>c;
        if (aIsMedianN){
            System.out.println(a+" is the median number");
        }
        if (bIsMedianN){
            System.out.println(b+ " is the median number");
        }
        if (cIsMedianN){
            System.out.println(c + " is the median number");
        }









    }
}
/*
 Create a class called MedianNumber. write a program that can find the median number between three DIFFERENT given integers

       Ex
        a = 10, b= 15, c = 20;
        Output:
         15 is the median number
 */