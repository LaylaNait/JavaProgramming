package day32_Constructors;

import java.util.ArrayList;

public class CarpetObject {
    public static void main(String[] args) {


        Carpet carpet1 = new Carpet(3,5,8,true);
        Carpet carpet2 = new Carpet(3,10,20,false);

        System.out.println(carpet1);
        System.out.println(carpet2);


        ArrayList<Integer> ll = new ArrayList<>();
         ll.add(2);
         ll.add(4);
         ll.add(8);
         ll.set(0,ll.get(2));


        System.out.println(ll);




    }
}
