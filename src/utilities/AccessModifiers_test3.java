package utilities;

import day40_FinalKyword.ProtectedAccessModifier; // we need to import the parent class if it is in another package

public class AccessModifiers_test3 extends ProtectedAccessModifier {
    public static void main(String[] args) {

        System.out.println(AccessModifiers_test3.name2); // protected access modifier is visible outside the package in subclass only



    }
}
