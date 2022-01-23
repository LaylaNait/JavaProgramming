package day40_FinalKyword;

public class Dog extends Animal{


    public Dog(String name, String breed, char gender, String color, String size, int age) {
        super(name, breed, gender, color, size, age);
    }

    @Override
    public void eat() {
        System.out.println(getName()+ " is eating dog food");
    }

   // public final void drink(){
    //    System.out.println(getName() + " is drinking milk"); can not be override because its final
   // }


}
