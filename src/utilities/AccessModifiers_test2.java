package utilities;

import day34_GarbageCollection_AccessModifiers.AccessModifiers;

public class AccessModifiers_test2 {
    public static void main(String[] args) {
        System.out.println(AccessModifiers.publicData);
     //   System.out.println(AccessModifiers.defaultData); default access modifier is not visible outside package
     //   System.out.println(AccessModifiers.privateData);private  access modifier is not visible outside package

        AccessModifiers.method1(); // public is the only methode can be visible
       // AccessModifiers.method2();
       // AccessModifiers.method3();

    }
}
