package day10_NestedIf;

public class TernariesWithNestedIf {

    public static void main(String[] args) {
        int s = 85;

      /*
       if (s >= 0 && s <=100){
            if (s>= 90){
                System.out.println("Excellent");
            }else if (s>=80){
                System.out.println("Great");
            }else if(s>=70){
                System.out.println("Good");
            }else if(s>=60){
                System.out.println("Passed");
            }else
                System.out.println("Failed");
        }else
            System.out.println("Invalid score ");

       */
        System.out.println("------------------------------------------");
        // solution 2: use ternaries only
        String result = (s>=0 && s<=100)? (s>=60)?"Passed":"Failed" :"Invalid number";
        System.out.println(result);




















    }
}
