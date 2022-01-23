package day40_FinalKyword;

public class FinalVariable {

    final String birthday;
    final  static String name;

    public FinalVariable(String birthday){
        this.birthday = birthday;

    }

    static {
        name = "Batch 25";  // we use static block to aviod the compiler error in final static variable
    }


    public static void main(String[] args) {

     final double pi = 3.14;// we apply the final keyword because final variable can not be reassigned


     final String name;
     name = "java";
   //  name = "Wooden spoon"; we can not reassign the final variable

        System.out.println(name);

        System.out.println("_________---------------------------------");

        FinalVariable obj = new FinalVariable("jun 15");
       // obj.birthday = "jun 1"; we can not change it




    }

}
