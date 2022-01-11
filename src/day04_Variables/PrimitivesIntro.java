package day04_Variables;

public class PrimitivesIntro {
    public static void main(String[] args) {
        // age 38 years old

        byte age = 38;
        // weight: 160 pound
        //byte weight = 160; i can use byte because 160 is out of byte range
        //byte num = -129; -129 is out of byte range
        short weight = 160;  // 160 is within the range of short

        //salary:100000 $
        //short salary = 100000; 100000 is out of short range
        int salary = 100000; // int is the preferred data type for integer numbers

        long asset = 3_333_333_333L;
        // tax: 0.26
        float tax = 0.26F;
        System.out.println("tax = " + tax);
        System.out.println("weight = " + weight);
        System.out.println("age = " + age);
        System.out.println("asset = " + asset);
        System.out.println("salary = " + salary);



        char cha1 = '#' ;
        char cha2 = 35;
        System.out.println("cha1 = " + cha1);
        System.out.println("cha2 = " + cha2);
        char genger = 'F';

        boolean isEmployeed = true;
        boolean isMaried = false;

        boolean result = 100>300;
        System.out.println("isEmployeed = " + isEmployeed);
        System.out.println("isMaried = " + isMaried);
        System.out.println("result = " + result);


        String name = "wooden spoon";
        System.out.println("name = " + name);
        String city = "Mclean";
        String state = "Virginia";
        String Country = "USA";
        System.out.println("city = " + city);
        System.out.println("state = " + state);
        System.out.println("Country = " + Country);

















    }






}
