package day28_ArrayList;

public class StrongPassword2 {
    public static void main(String[] args) {

   String password = "CLdeo1990@";

   int countUpperCase = 0;
   int countLowerCase = 0;
   int countDidits =0;
   int specialChar = 0;

        for (int i = 0; i < password.length(); i++) {
            char each = password.charAt(i);
            if (Character.isUpperCase(each)){
                countUpperCase++;
            }else if (Character.isLowerCase(each)){
                countLowerCase++;
            }else if (Character.isDigit(each)){
                countDidits++;
            }else {
                specialChar++;
            }
        }
        System.out.println("countUpperCase = " + countUpperCase);
        System.out.println("countLowerCase = " + countLowerCase);
        System.out.println("specialChar = " + specialChar);
        System.out.println("countDidits = " + countDidits);

       boolean hasUpperCase = countUpperCase>0;
       boolean hasLowerCase = countLowerCase>0;
       boolean hasDigit = countDidits >0;
       boolean hasSpecialChar = specialChar>0;
       boolean strongPassword = password.length()>=8 && !password.contains(" ")&&hasSpecialChar && hasLowerCase
               && hasDigit && hasUpperCase;
        System.out.println("strongPassword = " + strongPassword);


    }
}
