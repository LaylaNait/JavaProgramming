package day37_Inheritance.Animal;

public class AnimalObject {
    public static void main(String[] args) {

       Dog dog1 = new Dog("Alix","Husky",'M',"Small",1,"Withe");
        System.out.println(dog1);

        dog1.bark();
        //dog1.scratch();
        //dog1.sing();

        Cat cat1= new Cat("Love", "Siamese",'F',"Large",2,"Black");
        cat1.scratch();
        //  cat1.bark();
        //  cat1.sing();

        Parrot parrot1= new Parrot("King","Macaw",'M', "Small",3,
                "Blue");
        parrot1.sing();
        //  parrot1.bark();
        //  parrot1.scratch();

    }
}
