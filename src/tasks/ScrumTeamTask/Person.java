package tasks.ScrumTeamTask;

public class Person {
    private String name;

    private int age ;

    private char gender;

    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void eat(String food){
        System.out.println(name+" is eating "+ food);
    }
    public void drink(String drink){
        System.out.println(name+" is drinking"+ drink);
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
/*
1. Create a class named Person
			variables:
				name, age, gender

			methods:
				setInfo(): sets the name, age, gender of person
				eat(String food)
				drink(String drink)
				toString()
 */