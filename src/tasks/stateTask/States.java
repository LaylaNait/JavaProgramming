package tasks.stateTask;

public class States {
    private String name, abbreviation, politicalParty, Governor, senator;
    private double stateTax;
    private long population;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == "null" || name.isEmpty()) {
            System.out.println("Invalid entry");
            System.exit(1);
        }
        this.name = name;
    }

    public String getAbbreviation() {

        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        if (abbreviation == "null" || abbreviation.isEmpty()) {
            System.out.println("Invalid entry");
            System.exit(1);
            this.abbreviation = abbreviation;
        }
    }

    public String getPoliticalParty() {
        return politicalParty;
    }

    public void setPoliticalParty(String politicalParty) {
        if (politicalParty == "null" || politicalParty.isEmpty()) {
            System.out.println("Invalid entry");
            System.exit(1);
        }
        this.politicalParty = politicalParty;
    }


    public String getGovernor() {
        return Governor;
    }

    public void setGovernor(String governor) {
        if (governor == "null" || governor.isEmpty()) {
            System.out.println("Invalid entry");
            System.exit(1);
        }
        Governor = governor;
    }

    public String getSenator() {
        return senator;
    }

    public void setSenator(String senator) {
        if (senator == "null" || senator.isEmpty()) {
            System.out.println("Invalid entry");
            System.exit(1);
        }
        this.senator = senator;
    }


    public double getStateTax() {
        return stateTax;
    }

    public void setStateTax(double stateTax) {
        if (stateTax<0){
            System.out.println("Invalid Number ");
            System.exit(1);
        }
        this.stateTax = stateTax;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        if (population<=0){
            System.out.println("Invalid entry");
            System.exit(1);
        }
        this.population = population;
    }

    public States(String name, String abbreviation, String politicalParty,
                  String governor, String senator, double stateTax, long population) {
        setName(name);
        setAbbreviation(abbreviation);
        setPoliticalParty(politicalParty);
        setGovernor(governor);
        setSenator(senator);
        setStateTax(stateTax);
        setPopulation(population);

    }

    public String toString() {
        return "States{" +
                "name='" + getName() + '\'' +
                ", abbreviation='" + getAbbreviation() + '\'' +
                ", politicalParty='" + getPoliticalParty() + '\'' +
                ", Governor='" + getGovernor() + '\'' +
                ", senator='" + getSenator() + '\'' +
                ", stateTax= " + getStateTax() +
                ", population= " + getPopulation() +
                '}';
    }
}

/*
1. Create a class named States:
			variables:
				name, abbreviation, politicalParty, Governor, senator, population, stateTax

			Encapsulate all the fields

			Add a constructor that can set all the fields

						Conditions:
							1. name, abbreviation, politicalParty, Governor, and senator can not be null
							2. name, abbreviation, politicalParty, Governor, and senator can not be empty
							3. taxRate can not be negative
							4. Population can not be set to zero or negative

			Methods:
				toString()
 */