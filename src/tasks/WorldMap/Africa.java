package tasks.WorldMap;

public class Africa extends ContinentsAndCountriesOfTheWorld{
    public Africa(double area, long population) {
        super("Africa", area, population);
    }
    public void nationalFood(String food){
        System.out.println(getName()+ "'s national food is " + food);
    }
    public void nationalSport(String sport){
        System.out.println(getName()+ "'s national sport is"+ sport);
    }




}
