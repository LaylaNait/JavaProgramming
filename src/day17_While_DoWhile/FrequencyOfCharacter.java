package day17_While_DoWhile;

public class FrequencyOfCharacter {
    public static void main(String[] args) {

        String srt = "AAABBBC";
        char ch = 'A';
        int frequency = 0;
        for (int i = 0; i < srt.length()-1 ; i++) { //indexe number of str
            char eachChar = srt.charAt(i);// each char: each character of str
            if (eachChar ==ch){
                frequency++;
            }
        }
        System.out.println(frequency);

    }
}
/*
 Write a program that asks user to enter a string and a char,
 the returns the frequency of the char from the given string
            Ex:
                inputs:
                    str = "aabcccd";
                    char = 'c';

                output: 3

                inputs:
                    "Java programming language"
                    'g'

                output: 4
 */