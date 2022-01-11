package day21_ForEachLoop;

public class ForEachLoopPractice {
    public static void main(String[] args) {

   String [] words = {"Java programing", "Cydeo School", "Early Bird", "Wooden Spoon"};

        for (String each : words) {
         String result = each.charAt(0)+""+each.charAt(each.length()-1);
            System.out.println(result);
        }


    }
}
