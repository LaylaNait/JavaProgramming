package tasks;

import java.util.Scanner;

public class Triple {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int count = 0 ;
        for (int i = 0; i < str.length(); i++) {
            int t = str.indexOf(i);
            char ch = str.charAt(i);
            if (t== i){
                count++;
            }
            System.out.println(count);
        }



    }
}
/*
We'll say that a "triple" in a string is a char appearing three times in a row.
Print out the number of triples in the given string. The triples may overlap.

Example:

input: abcXXXabc

output: 1
input: abcXXXabc

output: 1
Example:

input: xxxabyyyycd

output: 3
input: xxxabyyyycd

output: 3
Example:

input: java

output: 0
 */