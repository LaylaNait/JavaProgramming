package day15ForLoop;

public class Alphabet {
    public static void main(String[] args) {

       // A~Z =====>65~90


      // A~Z
      for (char i = 65;i <=90;i++) {//a b c d ....z
          System.out.print((char)i+ " ");
      }
        System.out.println();

      //Z~A
        for (char i = 'Z'; i >='A';i--){ //i= 65 66 67 .....90
            System.out.print(i+ " ");//in order to print character not number we need to cast it to char
        }
        System.out.println();
        System.out.println("----------------------------------------");






    }
}
