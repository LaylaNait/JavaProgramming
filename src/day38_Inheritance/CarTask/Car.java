package day38_Inheritance.CarTask;

public class Car {
    public String brand, model, color;
    public int year;
    public double price, miles;

    public Car(String brand, String model, String color, int year, double price, double miles) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
        this.price = price;
        this.miles = miles;
    }

    public void start() {
        System.out.println(brand + " " + model + " is starting");
    }

    public void drive() {
        System.out.println("driving " + brand + " " + model);
    }

    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", miles=" + miles +
                '}';
    }
}
