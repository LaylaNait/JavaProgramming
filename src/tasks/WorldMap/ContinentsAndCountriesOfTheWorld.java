package tasks.WorldMap;

public class ContinentsAndCountriesOfTheWorld {

  private String name ;
  private double area;
  private long population;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null){
            System.out.println("Invalid name");
            System.exit(1);
        }
        if (name.isEmpty()||name.isBlank())
            System.out.println("Invalid entry ");
        System.exit(1);
        this.name = name;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        if (population<=0){
            System.out.println("Invalid number");
            System.exit(1);
        }
        this.population = population;
    }

    public ContinentsAndCountriesOfTheWorld(String name, double area, long population) {
        setName(name);
        setArea(area);
        setPopulation(population);
    }

    public void demographics(){
        System.out.println("Population of " + getName()+ " is " );
    }
    public void borders(){
        System.out.println(getName()+ " border's with ");
    }

    public String toString() {
        return "ContinentsAndCountriesOfTheWorld{" +
                "name='" + name + '\'' +
                ", area=" + area +
                ", population=" + population +
                '}';
    }
}
