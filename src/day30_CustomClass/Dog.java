package day30_CustomClass;

public class Dog {

    public String name;
    public String breed;
    public String size ;
    public  int age ;
    public char gender;
    public  String color ;

    public void eat (){
        System.out.println(name + " is eating" );
    }

    public void bark (){
        System.out.println(name + " is barking");
    }

    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", color='" + color + '\'' +
                '}';







    }

    public void setInfo (String dogName,String dogBreed,int dogAge, char dogGender, String dogSize, String dogColor){
        name = dogName;
        breed =dogBreed;
        age = dogAge;
        gender = dogGender;
        size = dogSize;
        color = dogColor;
    }







}
/*
Attributes:
name , age, gender, breed, size, color

Actions:
eat(), play(), bark(), .....



   -instance means each object can have separate copy
 */