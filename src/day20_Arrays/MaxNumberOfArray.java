package day20_Arrays;

public class MaxNumberOfArray {
    public static void main(String[] args) {
        int[] number = {10, 5, 4, 20, 1, 0};
        int max = number[0];//10

        for (int i = 0; i < number.length; i++) {
            if (number[i]>max){ // if there is element in the array that's greater than the current max number
                max=number[i]; //assigning greater number to variable max
            }
        }
        System.out.println(max);
        








        
        
    }
}
