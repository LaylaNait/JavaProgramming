package day16_ForLoopStringPractice;

public class DigitsLettersSpecialChars {
    public static void main(String[] args) {

        String str = "Cydeo 12345School!@#$%WoodenSpoon";
        String digits = "";//1234...
        String letters = ""; //cydeoschool...
        String specialCharacters = ""; //!@#$%...

        for (int i = 0; i < str.length(); i++) {//index number of str (0~last index)

            char ch = str.charAt(i); // ch:each character that we have in str
            if(ch>= '0'&& ch<='9'){//if the character is between '0' to '9'
                digits += ch;
            }else if (ch>= 'A' && ch<= 'Z' || ch>='a' && ch<= 'z'){
                letters +=ch;
            }else{
                if (ch != ' '){
                    specialCharacters+= ch;
                }


            }
        }

        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);
        System.out.println("specialCharacters = " + specialCharacters);













    }


}
