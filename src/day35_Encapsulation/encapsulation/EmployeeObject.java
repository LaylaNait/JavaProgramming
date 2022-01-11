package day35_Encapsulation.encapsulation;

public class EmployeeObject {
    public static void main(String[] args) {

     Employee employee1 = new Employee("",'G',2900,-150000);
     Employee employee2 = new Employee("Layla",'F',29,140000);

        System.out.println(employee1);
        System.out.println(employee2);

        employee2.setAge(32);
        System.out.println(employee2);

       Employee employee3 = new Employee("Aygun",'F',31,120000);
        System.out.println(employee3);
       employee3.setSalary(employee3.getSalary()+15000);
        System.out.println(employee3);




    }
}
