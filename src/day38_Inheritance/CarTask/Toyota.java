package day38_Inheritance.CarTask;

public class Toyota extends Car {
    public Toyota( String model, String color, int year, double price, double miles) {
        super("Toyota", model, color, year, price, miles);
    }

public void reliable(){
    System.out.println(brand+ " "+ model+ "is reliable");
}







}
