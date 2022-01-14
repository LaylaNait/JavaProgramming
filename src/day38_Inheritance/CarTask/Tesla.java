package day38_Inheritance.CarTask;

public class Tesla extends Car {

    public Tesla( String model, String color, int year, double price, double miles) {
        super("Tesla", model, color, year, price, miles);
    }
    public void autoPilot(){
        System.out.println(brand+ " "+ model+ " in autopilot mode");
    }

    @Override
    public void start() {
        System.out.println("Say \"Start\" to start "+ brand+ " "+model);
    }
}
