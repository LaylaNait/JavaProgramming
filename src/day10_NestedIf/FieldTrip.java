package day10_NestedIf;

public class FieldTrip {
    public static void main(String[] args) {
        int grade = 2;
        String location= "";
        int groupNumber = 3;
        String nameOfTeacher = "";

        if (grade>=1 && grade<=6){
            if(grade == 1){
                location = "Apple orchard";
                groupNumber = 3;
                nameOfTeacher = "Ms. Smith";
            }else if(grade == 2){
                location = "Zoo";
                groupNumber = 7;
                nameOfTeacher = "Mr. Lee";
            }else if(grade == 3) {
                location = "Aquarium";
                groupNumber = 5;
                nameOfTeacher = "Ms. Wilson";

            }else if(grade == 4){
                location = "Movie theater";
                groupNumber =2;
                nameOfTeacher= "Ms. Reyes";
            }else if (grade == 5){
                location = "Museum";
                groupNumber =5;
                nameOfTeacher = "Ms, Lela";
            }else {
                location ="Six Flags";
                groupNumber =8;
                nameOfTeacher = "Mr. Watt";
            }

        }else {
            System.out.println("Invalid Grade");
        }

        System.out.println("location - "+location+"\nnumber of groups - "+ groupNumber +
                "\nteacher in charge - "+ nameOfTeacher);














    }
}
/*
Create a class called FieldTrip. your school goes on a field trip each year.
the place you go will be based on your grade. given a variable gradeNumber (1-6) figure out the details of your
field trip. print the information at the end.
data based 0n grade:
grade - 1
location - Apple orchard
number of groups - 3
teacher in charge -Ms Smith
grade-2
location - Zoo
number of groups - 7
teacher in charge -Mr.lee
grade-3
location - Aquarium
number of groups - 5
teacher in charge -Ms. Wilson
grad-4
location - Movie theater
number of groups - 2
teacher in charge -Ms. Reyes
grade-5
location - Museum
number of groups - 5
teacher in charge -Ms, Lela
grade - 6
location -Six Flags
number of groups - 8
teacher in charge -Mr. Watt



 */