package day21_ForEachLoop;

import java.util.Arrays;

public class MergeTwoArray {
    public static void main(String[] args) {

        String[]group1 = {"Ali","Layan","Aysenur"};
        String[] group2 ={"Maia","Layla","Suat","Valeriy"};

        String[]student = new String[group1.length+group2.length];

        int i = 0;
        for (String each : group1) {
            student[i++] = each;
        }
        for (String each : group2) {
            student[i++] = each;
        }

        System.out.println(Arrays.toString(student));
        System.out.println("_______________________________________________________");

        char[] ch1 = {'A','B','C','D','E'};
        char[] ch2 = {'F','G','H'};

        char [] ch3 = new char[ch1.length+ch2.length];
          int j = 0;
        for (char each : ch1) {
            ch3[j++] = each;
        }

        for (char each1 : ch2) {
            ch3[j++]=each1;
        }

        System.out.println(Arrays.toString(ch3));


    }
}
