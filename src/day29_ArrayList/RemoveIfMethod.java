package day29_ArrayList;

import utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfMethod {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        System.out.println(list);
        list.removeIf( p ->p <5);
        System.out.println(list);
        System.out.println("-----------------------------------------");

        ArrayList<String>list3 = new ArrayList<>();
        list3.addAll(Arrays.asList("java","C#","Python","java","C++","Java"));

        list3.removeIf(p-> p.startsWith("j"));

        System.out.println(list3);
        System.out.println("----------------------------------------------------");

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Anna","Aya","Yelda","Eye","level","Cydeo"));

       names.removeIf(name -> StringUtility.isPalindrome(name));
        System.out.println(names);

    }
}
