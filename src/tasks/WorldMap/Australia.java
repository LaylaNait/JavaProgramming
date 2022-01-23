package tasks.WorldMap;

public class Australia extends ContinentsAndCountriesOfTheWorld{
    public Australia( double area, long population) {
        super("Australia", area, population);
    }

    public void nationalFood(String food){
        System.out.println(getName()+ "'s national food is " + food);
    }
    public void nationalSport(String sport){
        System.out.println(getName()+ "'s national sport is"+ sport);
    }



}
