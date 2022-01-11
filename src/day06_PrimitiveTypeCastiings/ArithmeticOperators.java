package day06_PrimitiveTypeCastiings;

public class ArithmeticOperators {
    public static void main(String[] args) {

        System.out.println( "12" + 1);//121 concatenation
        System.out.println(10 + 20 ); //addition
        System.out.println(20 - 10 ); //subtraction
        System.out.println(20 * 10 ); //multiplication

        System.out.println(100 / 3);
        System.out.println(10 / 4);
        System.out.println((double)10/4);
        System.out.println(10.0/4);
        System.out.println(10/4.0);
        System.out.println(10d/4);

        int a = 100;
        double b = a/6;//16.0
        System.out.println(b);
        double c = (double)a/6; //16,6666

        System.out.println(100d);

























    }


}
/*
+ : Addition
- : Subtraction
* : Multiplication
/ : Division
        in math 10/4= 2.5
        in java 10/4=2
              10.0/4=2.5
              10/4.0=2.5
       integer/integer = integer num
       decimal/integer = decimal num
       integer/decimal = decimal num
 */