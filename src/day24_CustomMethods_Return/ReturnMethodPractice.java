package day24_CustomMethods_Return;

public class ReturnMethodPractice {
    public static void main(String[] args) {
       int maxN = max(100,200);
        System.out.println(maxN);

        // multiply the max number by 2
        int multiplication = maxN *2;
        System.out.println(multiplication);
    }
    // find the max number between 100 & 200
    public static int max (int a, int b){
        int result = 0;
        if (a>b){
            result = a ;
        }else {
            result = b;
        }
        return result;
    }
}
