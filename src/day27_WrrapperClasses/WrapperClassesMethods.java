package day27_WrrapperClasses;

public class WrapperClassesMethods {
    public static void main(String[] args) {

        String str = "123";
       int num  = Integer.parseInt(str);
        System.out.println(num +1); //124
        System.out.println(str+1);//1231

        String str2= "10.5";
        double num2 =  Double.parseDouble(str2);

        System.out.println(num2 +1);
        System.out.println(str2+ 1);
        System.out.println("===========================================================================");

       int max = Integer.MAX_VALUE;
       int min = Integer.MIN_VALUE;

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        long max2 = Long.MAX_VALUE;
        long min2 = Long.MIN_VALUE;

        String s1 = "maybe";
        boolean r1 = Boolean.parseBoolean(s1);

        String s2 = "123";
        Integer x = Integer.valueOf(s2);
        int y = Integer.valueOf(s2);   // valueOf() return wrapper class that's why we have autoboxing here
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        String s3 = "1.5";
        Double z = Double.valueOf(s3);
        System.out.println("z = " + z);
        System.out.println("=============================================================");

     // isDigit()
        char ch1 = '&';
        boolean r2 = Character.isDigit(ch1);
        boolean r3 = Character.isLetter(ch1);
      // special char
       boolean r4 =  Character.isLetterOrDigit(ch1);

        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);
        System.out.println("r4 = " + r4);

     // upperCase
        boolean r5 = Character.isUpperCase(ch1);
      // lowerCase
      boolean r6 = Character.isLowerCase(ch1);


     String s = "abc1de2ef3hi5";

     int sum = 0;
        for (char each : s.toCharArray()) {
            if (Character.isDigit(each)){
                sum +=Integer.parseInt(each+"");
            }
        }
        System.out.println(sum);



    }
}
