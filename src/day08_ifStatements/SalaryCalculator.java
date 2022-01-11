package day08_ifStatements;

public class SalaryCalculator {
    public static void main(String[] args) {
        int hourlyRate = 50;
        int weeklyHours = 45;
        double stateTaxRate = 6.5,
                federaleTaxRate = 26.2;
        int salaryBeforeTax = hourlyRate * weeklyHours * 52;
        double stateTax = salaryBeforeTax * stateTaxRate/100;
        double federaleTax = salaryBeforeTax * federaleTaxRate /100;
        double totaleTax = stateTax + federaleTax;
        double salaryAfterTax = salaryBeforeTax - totaleTax;
        System.out.println("Gross pay is: $"+salaryBeforeTax);
        System.out.println("State tax = $"+ stateTax);
        System.out.println("Federal tax = $"+ federaleTax);
        System.out.println("Totale tax = $"+ totaleTax);
        System.out.println("Net income = $"+ salaryAfterTax);













    }
}
