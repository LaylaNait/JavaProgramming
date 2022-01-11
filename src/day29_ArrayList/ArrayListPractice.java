package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice {
    public static void main(String[] args) {
       String[] countries ={"Japan","Korea","United States", "Turkey","Canada","United kingdom"};

       // convert array to arraylist:

        ArrayList<String>list =new ArrayList<>(Arrays.asList(countries));
        list.removeIf(p -> p.length() >= 10);

        //convert arraylist to array

       countries = list.toArray(new String[0]); // we can give any number instead of 0 [x]
        System.out.println(Arrays.toString(countries));





    }
}
