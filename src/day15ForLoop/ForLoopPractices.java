package day15ForLoop;

public class ForLoopPractices {
    public static void main(String[] args) {

        // 15 16 17 18.........45

        for (int i = 15; i <= 45;i++){
            System.out.print(i + " ");

        }

        System.out.println("\nhello");
        // 100 99 95 ......50
        for (int i = 100; i>=50 ; i--){//i: 100 99 98 97 .......50
            System.out.print(i+" ");
        }
        System.out.println("------------------------------------------");
          // print all the even number between 1~55

        for (int i =1;i <= 55; i++ ){
            if(i % 2 == 0){
                System.out.print(i+ " ");
            }
        }
        //print all the even number between 1~55 2, 4, 6, .........45.

        for (int i = 2; i<=54; i+=2){
            System.out.print(i+ " ");
        }










    }
}
