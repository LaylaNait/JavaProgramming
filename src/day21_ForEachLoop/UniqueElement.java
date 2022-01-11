package day21_ForEachLoop;

public class UniqueElement {
    public static void main(String[] args) {

     String[] words = {"Layan","Layan","Orga","Maria","Adam","Adam","Cydeo","Cihad"};

        for (String each : words) {  //"Layan","Layan","Orga","Maria","Adam","Adam","Cydeo","Cihad"
            int count = 0;
            for (String element : words) {//"Layan","Layan","Orga","Maria","Adam","Adam","Cydeo","Cihad"
                if (element.equals(each)){
                    count++;
                }
            }
            if (count == 1){
                System.out.println(each);
            }
        }






    }
}
