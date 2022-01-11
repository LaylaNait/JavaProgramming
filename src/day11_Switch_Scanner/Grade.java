package day11_Switch_Scanner;

public class Grade {
    public static void main(String[] args) {
        char grade = 'A';
        switch (grade){
            case 'A' :
                System.out.println("excellent");
                break;
            case 'B':
                System.out.println("great job");
                break;
            case 'C':
                System.out.println("good");
                break;
            case 'D':
                System.out.println("passed");
                break;
            case 'F':
                System.out.println("Failed");
                break;
            default:
                System.out.println("Invalid");
        }









    }
}
/*
1. NameOfMonth  (1~12)
	2. NumberToWord (0~9)
	3. a char variable named grade is given. use switch statement to print the following messages:
			'A': excellent
			'B': great job
			'C': good
			'D': passed
			'F': failed
			other wise: invalid

 */