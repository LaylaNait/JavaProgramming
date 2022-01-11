package day07_Operators;

public class UnaryOperators {
    public static void main(String[] args) {
      int num1=+25;
      int num2 =-25;
      System.out.println(num1<0);
      System.out.println(num2<0);

      int a = 5;
      ++a; //pre increment: increases the value by 1 right away
      System.out.println(a);//6
      --a; //pre decrement: decreases the value by 1 right away
      System.out.println(a);


        int x =200;
        System.out.println(--x); //pre decrement: deceases the value by 1 right away

        int y = 200;
        System.out.println(y--); //post decrement: first passes the current value,then decrease the value by 1
        System.out.println("------------------------------------------------");

        int z = 45;
        System.out.println(++z); //46 z=46
        System.out.println(z++); //46 after this line z= 47
        System.out.println(z); //47

        int q = 30;

        System.out.println(--q);//29 q=29
        System.out.println(q--);//29 q=29
        System.out.println(q); //28





    }








}
