package day30_CustomClass;

import java.util.ArrayList;

public class StudentObject {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setInfo("Aygun",'F',39,2210,'A');

        System.out.println();
      Student student2 = new Student();
        student2.setInfo("Layla",'F',28,3425,'A');

        Student student3 = new Student();
        student3.setInfo("Elminur", 'F',26,2215,'A');

        Student student4 = new Student();
        student4.setInfo("Ali", 'M',28,5511,'B');

        Student student5 = new Student();
        student5.setInfo("Mert", 'M', 26 ,2252, 'C');
        System.out.println("-------------------------------------------------------------");
        
        Student[] students = {student1,student2,student3,student4,student5};

        ArrayList<Student> earlyBirds = new ArrayList<>();
        ArrayList<Student> angryBird = new ArrayList<>();
        for (Student each : students) {
            System.out.println();
        }


    }
}
