package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class CollectionUtility {
    public static void main(String[] args) {

        ArrayList<Integer>list = new ArrayList<>();
        list.addAll(Arrays.asList(10,9,8,7,6,5,4,3,2,1));
        Collections.sort(list);

        System.out.println(list);
        System.out.println("--------------------------------------");
       ArrayList<String> words = new ArrayList<>();
       words.addAll(Arrays.asList("Java","Java","Python","Python","Ruby","C#"));

        int countJava = Collections.frequency(words,"Java");
        System.out.println("countJava = " + countJava);



    }
}
