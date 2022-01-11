package day30_CustomClass;

public class Student {

    public String name;
    public char gender;
    public int ID;
    public int age;
    public char grade;




    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", ID=" + ID +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }

    public void setInfo(String name, char gender, int ID, int age, char grade) {
        this.name = name;
        this.gender = gender;
        this.ID = ID;
        this.age = age;
        this.grade = grade;
    }

    public void code() {
        System.out.println(name + " is coding");
    }
    public void sleep (){
        System.out.println(name+ " is sleeping");
    }





}
