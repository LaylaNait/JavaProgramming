package day34_GarbageCollection_AccessModifiers;

public class StaticBlock {
    public static void main(String[] args) {
        System.out.println("main method");
    }

    static { // only run one time before the main method, and it doesn't run if we don't have main method
        System.out.println("static block");
    }

    static {
        System.out.println("static block 2");
    }
}
