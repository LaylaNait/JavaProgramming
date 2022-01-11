package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2 {
    public static void main(String[] args) {
        ArrayList<String>employee =new ArrayList<>();
        employee.addAll(Arrays.asList("Ahmed","Ali","Jimmy","Aaron","David","Shay","Daniel"));
        employee.retainAll(Arrays.asList("Ahmed","David"));

        System.out.println(employee);
        System.out.println("---------------------------------------------------------");

        String[]names = {"Maria","Monica","Mona","Senia","Hasan","Berly"};
        ArrayList<String>list = new ArrayList<>(Arrays.asList(names));
        list.removeIf(p-> p.charAt(0)=='M');

        System.out.println(list);
        System.out.println("-----------------------------------");

       names = list.toArray(new String[0]);

        System.out.println(Arrays.toString(names));





    }
}
