package day21_ForEachLoop;

public class AverageNumber {
    public static void main(String[] args) {

        int[] numbers = {10,3,23,21,16,6,3,2};
        double sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        double average = sum/numbers.length;

        System.out.println(average);




    }
}
