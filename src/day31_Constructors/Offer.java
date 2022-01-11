package day31_Constructors;

public class Offer {
    public String location, companyName, jobTitle;
    public double salary;
    public boolean hasBenefit, hasPTO, isWFH, isFullTime;

    public  void setInfo (String location, String companyName, String jobTitle, double salary, // this method it helps me to generte all the altibrute
                 boolean hasBenefit, boolean hasPTO, boolean isWFH, boolean isFullTime) {
        this.location = location;
        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.hasBenefit = hasBenefit;
        this.hasPTO = hasPTO;
        this.isWFH = isWFH;
        this.isFullTime = isFullTime;
    }


    public String toString() {// in order to avoid the hashcode helps to print in the console
        return "Offer{" +
                "location='" + location + '\'' +
                ", companyName='" + companyName + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", hasBenefit=" + hasBenefit +
                ", hasPTO=" + hasPTO +
                ", isWFH=" + isWFH +
                ", isFullTime=" + isFullTime +
                '}';
    }
}
