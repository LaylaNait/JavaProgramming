package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObject {
    public static void main(String[] args) {



      Car car1  = new Car();

     car1.setInfo("Tesla"," X","Bleu",2020,90.990);

        System.out.println(car1);

        Car car2 = new Car();
        car2.setInfo("BMW","335is","Black",2020,45000);
        System.out.println(car2);

        Car car3 =new Car();
        car3.setInfo("Audi","Q7","Red",2019,40000);

        System.out.println(car3);

        ArrayList<Car> carList = new ArrayList<>();
        carList.addAll(Arrays.asList(car1,car2,car3));

        for (Car each : carList) {
            System.out.println(each.brand+ " : "+each.price);
        }
        System.out.println("------------------------------------------------------");

      carList.removeIf(p-> p.brand.equals("BMW") && p.year >=2005 && p.year<=2008);
      carList.removeIf(p-> p.brand.equals("Toyota")&& p.year>=2000 && p.year<=2005);

    }





}
