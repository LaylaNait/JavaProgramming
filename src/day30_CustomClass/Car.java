package day30_CustomClass;

public class Car {

    public String brand;
    public String model;
    public String color;
    public int year;
    public double price;

    public void drive(){
        System.out.println("Driving "+ brand + " " + model );
    }
    public void start(){
        System.out.println(brand +" "+ model +  " has started ");
    }
    public void stop(){
        System.out.println(brand + " " +model + " has stopped ");
    }

    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price= $" + price +
                '}';
    }
    public void setInfo(String carBrand, String carModel, String carColor, int carYear, double carPrice){
        model = carModel;
        brand =carBrand;
        color = carColor;
        year = carYear;
        price = carPrice;
    }
}
/*
Car Class:

    Attributes:
        brand, model, color, year, price

    Actions:
        drive(), start(), stop(), toString(), setInfo()


Student Class:

    Attributes:
        name, gender, age, studentID

    Actions:
        eat(), sleep(), drink(), code()
        setInfo(): to set all the attributes of student object
        toString(): to print the full info of student
 */