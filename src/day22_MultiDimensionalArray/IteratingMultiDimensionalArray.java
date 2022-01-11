package day22_MultiDimensionalArray;

import java.util.Arrays;

public class IteratingMultiDimensionalArray {
    public static void main(String[] args) {



        // index of the element  0 1 3    0 1 2 3   0 1  2  3   4
               int[][] arr2D = {{1,2,3}, {4,5,6,7},{8,9,10,11,12}};
        //           indexN         0         1           3


        for (int i = 0; i < arr2D.length; i++) { // i : index numbers of single dimensional arrays
            for (int j = 0; j <arr2D.length ; j++) { // i : index number of element
                System.out.print(arr2D[i][j]+ " ");

            }

        }








    }
}
