package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {


        ArrayList<Integer>list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,3,3,3,4,5,5,5,6,7,8,8,8,8));
        System.out.println(list);

      list.removeAll(Arrays.asList(3,5,8));
        System.out.println(list);
        System.out.println("----------------------------------------------");

        ArrayList<Integer>numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(100,200,300,400,500,600,700,100,200,300,800,900));
        System.out.println(numbers);
        numbers.retainAll(Arrays.asList(100,200,300));
        System.out.println(numbers);
        boolean r1 =numbers.contains(10);
        boolean r2 = numbers.contains(5);
        boolean r3 = numbers.contains(2);
        numbers.contains(Arrays.asList(2,5,10.100));
        System.out.println(numbers);


        System.out.println("-------------------------------------------");
        Integer[]arr = {1,2,3,4,5,6,7,8,9,10};
        ArrayList<Integer>list2 = new ArrayList<>(Arrays.asList(arr));

        System.out.println(list2);
        System.out.println("--------------------------------------------");
        int []arr2 = {1,2,3,4,5,6};

        ArrayList<Integer>list3 = new ArrayList<>(convertArrayToArrayList(arr2));
        System.out.println("list3 = " + list3);



    }

   public static ArrayList<Integer> convertArrayToArrayList(int[]array){
        ArrayList<Integer> list =new ArrayList<>();
       for (int each : array) {
           list.add(each);
       }
       return list;
   }



}
