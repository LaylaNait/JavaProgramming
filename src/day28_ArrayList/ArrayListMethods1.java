package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main(String[] args) {

        ArrayList<Integer>numbers = new ArrayList<>();
        numbers.add(10);//0 index number
        numbers.add(20);//1
        numbers.add(30);//3
        numbers.add(40);//4
        numbers.add(50);//6
        numbers.add(60);//7
        numbers.add(2,25); //2
        numbers.add(5,45); //5
        System.out.println(numbers);

        System.out.println(numbers.size());
        int lastIndex = numbers.size()-1;

         int num = numbers.get(3);
        System.out.println("num = " + num);
        System.out.println("-----------------------------------------------");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
        System.out.println("-------------------------------------------------");


        ArrayList<String>list = new ArrayList<>();
        list.add("java");
        list.add("Python");
        list.add("java");
        list.add("C#");
        list.add("Ruby");
        list.set(2,"java script"); //replace

        System.out.println(list);

        System.out.println("-----------------------------------------------");

        ArrayList<String> employees = new ArrayList<>();

        employees.add("Suat");
        employees.add("Aygun");
        employees.add("Layla");
        employees.add("Maria");
        employees.add("Ali");
        employees.add("Olga");
        employees.add("Hulya");

        System.out.println(employees);
        employees.remove(0);
        System.out.println(employees);
        employees.remove(0);
        System.out.println(employees);
        employees.remove(0);
        System.out.println(employees);
        employees.remove(employees.size()-1);
        System.out.println(employees);
        boolean r1 = employees.remove("Olga");
        System.out.println(employees);
         boolean r2 = employees.remove("Ali");
        System.out.println(employees);

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);



    }
}
