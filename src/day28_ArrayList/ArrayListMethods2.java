package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods2 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
         list.add(100);
        list.add(200);
        list.add(200);
        list.add(200);
        list.add(300);
        list.add(400);
        System.out.println("list = " + list);
        Integer num = 200; // integer is nn primitive
        list.remove(num); // we can not put 200 because it take is as int it remeve index
        System.out.println("list = " + list);

        boolean r = list.remove(num); // true if num exist in the list if not return false
        System.out.println(list);
        System.out.println(r);

        System.out.println("---------------------------------------");
        System.out.println(list.size());
        list.clear();
        System.out.println(list.size());
        System.out.println(list);

        ArrayList<Character>characters = new ArrayList<>();
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        int a = characters.indexOf('A'); //0
        int b = characters.lastIndexOf('A');



        System.out.println("----------------------------------------");


        boolean r2 = characters.contains('Z');
        System.out.println(r2);

        System.out.println("---------------------------------------------");

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(100);
        list1.add(200);
        list1.add(200);
        list1.add(200);
        list1.add(300);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(100);
        list2.add(200);
        list2.add(200);
        list2.add(200);
        list2.add(300);
        System.out.println(list1 == list2);
        System.out.println(list1.equals(list2)); // should be same elements in same order to return true

        System.out.println("--------------------------------------------------------------");

        list.clear();
        boolean r4 = list.isEmpty();

        System.out.println("r4 = " + r4);
        System.out.println("--------------------------------------------------===");
        ArrayList<Integer> numbers = new ArrayList<>();





    }
}
