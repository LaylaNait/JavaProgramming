package utilities;

import day34_GarbageCollection_AccessModifiers.AccessModifiers;
import day40_FinalKyword.ProtectedAccessModifier;

public class AccessModifiers_test2 {
    public static void main(String[] args) {
        System.out.println(AccessModifiers.publicData);
     //   System.out.println(AccessModifiers.defaultData); default access modifier is not visible outside package
     //   System.out.println(AccessModifiers.privateData);private  access modifier is not visible outside package

        AccessModifiers.method1(); // public is the only methode can be visible
       // AccessModifiers.method2();
       // AccessModifiers.method3();

        System.out.println("--------------------------------------------------------------------");

        //System.out.println(ProtectedAccessModifier.name1); default is not visible outside the package
       // System.out.println(ProtectedAccessModifier.name2); protected is not always visible outside the package

    }
}
