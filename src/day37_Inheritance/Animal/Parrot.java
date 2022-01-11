package day37_Inheritance.Animal;

public class Parrot extends Animals{

    public Parrot(String name, String breed, char gender, String size, int age, String color) {
        super(name, breed, gender, size, age, color);
    }

    public void sing(){
        System.out.println(name+" is singing");
    }



}
