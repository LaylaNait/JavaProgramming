package day17_While_DoWhile;

public class BranchingStatements2 {
    public static void main(String[] args) {
        for (char i = 'A'; i <='E'; i++) {
            if (i == 'C'){
                continue; // skipping C and execute A B D E
            }
            System.out.print(i+ " ");

        }
        System.out.println();
        // print all even number 1~10

        for (int i = 1; i <= 10; i++) {
            if ( i%2 !=0){ // 1,3,5,7,9 make this condition true that's way they will be skipped
                continue;

            }
            System.out.print(i+ " ");
        }
        System.out.println();

        System.out.println("----------------------------------");
        for (int i = 1; i < 11; i++) {
            if (i%2 ==0 ){
                continue;
            }
            System.out.print(i + " ");
        }







    }
}
