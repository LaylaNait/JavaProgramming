package day21_ForEachLoop;

public class Initials {
    public static void main(String[] args) {

        String[] classMates = {"Elminur Ablimit","Ali Kilic","Layla Nait","Simen Kaya","Taha Agriche"} ;

        for (String each : classMates) {
            String initial =each.charAt(0)+"."+each.charAt(each.indexOf(" ")+1);
            System.out.println(initial);
        }









    }
}
