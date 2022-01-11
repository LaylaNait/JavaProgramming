package day30_CustomClass;

import java.util.Arrays;

public class CapitalOne {

  public static void main(String[] args) {

    Employee employee1 = new Employee();
    Employee employee2 = new Employee();
    Employee employee3 = new Employee();
    Employee employee4 = new Employee();
    Employee employee5 = new Employee();


      employee1.setInfo("David",'M',23,34567,"Developer",100000,true);
      employee2.setInfo("layla",'F',34,23414,"Director",500000,false);
      employee3.setInfo("John",'M',25,2237,"Developer",100000,true);
      employee4.setInfo("Anna",'F',28,2287,"QA",85000,true);
      employee5.setInfo("Lina",'F',45,2290,"Manager",80000,true);


      Employee [] employees = {employee1,employee2,employee3,employee4,employee5};

       int countFullTime =0;
       double minSalary = employees[0].salary;
       double maxSalary = employees[0].salary;


    for (Employee each : employees) {
      if (each.isFullTime){
        countFullTime++;
      }
      if (each.salary > maxSalary){
        maxSalary = each.salary;
      }
      if (each.salary<minSalary){
        minSalary = each.salary;
      }


    }


    System.out.println("countFullTime = " + countFullTime);
    System.out.println("maxSalary = " + maxSalary);
    System.out.println("minSalary = " + minSalary);






    }

  }


/*
CapitalOne Class:

    1. create 5 Employee objects
    2. store those 5 employee objects into an array
    3. how many employees are full time employees?
    4. What's the minimum salary
    5. what's the maximum salary
 */