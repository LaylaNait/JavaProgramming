package tasks.WorldMap;

public class Asia extends ContinentsAndCountriesOfTheWorld{
    public Asia( double area, long population) {
        super("Asia", area, population);
    }


    public void nationalFood(String food){
        System.out.println(getName()+ "'s national food is " + food);
    }
    public void nationalSport(String sport){
        System.out.println(getName()+ "'s national sport is"+ sport);
    }


}
