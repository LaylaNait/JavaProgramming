package day36_Inheritance.AnimalTask;

public class Zoo {
    public static void main(String[] args) {

      Dog dog = new Dog();
      dog.setInfo("Max","Husky",'M',"Small",4,"black");

      dog.eat();
       dog.eat();
        dog.sleep();
        dog.move();
        dog.bark();
       Cat cat =new Cat();
       cat.setInfo("Tarsine","British",'M',"Small",3,"brown");
       cat.meow();
       cat.drink();
       cat.scratch();
       cat.eat();
        System.out.println(cat);

        Tiger tiger = new Tiger();
        tiger.setInfo("Sher Khan", "Bengal", 'M', "Large", 4, "Red");
        tiger.setInfo("Sher Khan", "Bengal", 'M',"Large", 4, "Orange");

        tiger.eat();
        tiger.sleep();
        tiger.drink();
        tiger.move();

        tiger.roar();
        tiger.hunt();

        System.out.println(tiger);

    }
}
