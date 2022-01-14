package day38_Inheritance;

import day38_Inheritance.CarTask.BMW;
import day38_Inheritance.CarTask.Tesla;
import day38_Inheritance.CarTask.Toyota;

public class ParkingLot {
    public static void main(String[] args) {

        Toyota toyota1 = new Toyota("Camry","Black",2020,54000,100.000);

        Tesla tesla = new Tesla("Model S", "Bleu", 2021, 75000, 0);

        BMW bmw = new BMW("X5", "whit", 2018, 50600, 12000);

      toyota1.start();
      tesla.start();
      bmw.start();


    }
}
