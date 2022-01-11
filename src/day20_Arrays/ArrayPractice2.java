package day20_Arrays;

import java.util.Arrays;

public class ArrayPractice2 {
    public static void main(String[] args) {
        char[]letters = new char[26];

       /*  first solution:
       for (char i = 'A', j=0; i<='Z'&& j <letters.length; i++,j++) {
           letters[j]=i;

        }

         seconde solution
        for (int i = 0, j = 'A'; i < letters.length; i++, j++) {
                letters[i]=(char)j;
        }
*/
        // third solution
       char ch = 'A';
        for (int i = 0; i <letters.length ; i++) {
            letters[i] = ch++;
        }

        System.out.println(Arrays.toString(letters)); // A~Z
        System.out.println("----------------------------------------");

        for (int i = 0, j = 'Z'; i<letters.length; i++,j--) {
                letters[i] = (char)j;
        }

        System.out.println(Arrays.toString(letters)); //Z~A







    }
}
