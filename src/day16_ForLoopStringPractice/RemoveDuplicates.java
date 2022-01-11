package day16_ForLoopStringPractice;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "aabbaacc";
        String result ="" ;
                          //i<=7 or i <8
        for (int i = 0; i <= str.length()-1; i++) {     // i:represents the all the index numbers of str (start from 0)
            String ch = ""+ str.charAt(i);             // represents each character for str
            if(!result.contains(ch)){                  // if the character is not contained in the result
                result += ch;                          // the character will be added to the result

            }
        }
        System.out.print(result);
/*
write a program that can remove the duplicated character from a string
          Ex :
          input:
            AABBCCBC
         output:
            ABC
 */



    }
}
