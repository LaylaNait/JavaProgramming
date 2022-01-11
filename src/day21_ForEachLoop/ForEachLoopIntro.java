package day21_ForEachLoop;

public class ForEachLoopIntro {
    public static void main(String[] args) {
      int[] numbers = {10,20,30,40,50,60,70};

         for (int i = 0; i < numbers.length; i++) { // i: index number of the elements
            int eachElement = numbers[i];
            System.out.println(eachElement);

        }
        System.out.println("------------------------------------------");
        // using for each loop

      for (int each :numbers){ //varaible each element of the array
          System.out.println(each);
      }




    }
}
