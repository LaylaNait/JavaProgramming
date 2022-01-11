package day34_GarbageCollection_AccessModifiers;

public class AccessModifiers_test {
    public static void main(String[] args) {
        System.out.println(AccessModifiers.publicData);
        System.out.println(AccessModifiers.defaultData);
        //System.out.println(AccessModifiers.privateData); we can not access to this data because
        // private is not visible outside the class

        AccessModifiers.method1();
        AccessModifiers.method2();
       // AccessModifiers.method3(); can not used
    }
}
