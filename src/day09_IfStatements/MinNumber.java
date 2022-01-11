package day09_IfStatements;

public class MinNumber {
    public static void main(String[] args) {

       int n1 = 100,
               n2 = 200;
       boolean n1IsMin = n1<n2;
       boolean n2IsMin = n2<n1;
       boolean equal = n1 == n2;

       if (n1IsMin){
           System.out.println(n1 + " is the minimum number");
       }
       if (n2IsMin){
           System.out.println(n2 +" is the minimum number");
       }
       if (equal){
           System.out.println("equal");
       }









        int a = 10,
                b= 15,
                c=20;

        boolean aIsMedian = (a>b && a<c) || (a>c && a<b);
        /*
        In order for a to be the median number:
        1.if c is the maximum number & b is the minimum number, then a is the median number
        2. if b is the maximum number & c is the minimum number, then a is the median number

         */
        boolean bIsMedian = (b>c && b<a) || (b>a && b<c);
        /*
        In order for b to be the median number:
        1.if a is the maximum number & c is the minimum number, then b is the median number
        2.if c is the maximum number & a is the minimum number, the b is the median number
         */
        boolean cIsMedian = !aIsMedian && !bIsMedian;

        if(aIsMedian){
            System.out.println("The median number is" + a);
        }
        if (bIsMedian){
            System.out.println("The median number is " + b);
        }
        if (cIsMedian){
            System.out.println("The median number is "+ c);
        }







    }
}
