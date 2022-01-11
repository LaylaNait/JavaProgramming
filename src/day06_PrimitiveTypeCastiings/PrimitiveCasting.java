package day06_PrimitiveTypeCastiings;

public class PrimitiveCasting {
    public static void main(String[] args) {

        byte a = 100;
        short b = a;
        // short b = (short)a; this is what compiler does in background
        int c = b; // Implicit casting int c = (int)b
        long d = c;
        float e = d;
        double f = e;
    //double> float> long> int> short> byte.
        System.out.println("----------------------------------------------");

        int x = 55;
        short y = (short)x; //explicit casting
        System.out.println(x + " : " + y);

        long j = 1000000;
        short k = (short) j;
        System.out.println(j + " : " +k);

        double l = 2.5;
        float m = (float) l;
        System.out.println( l + " : " +m);
         double n = 10.8;
         int s = (int)n;

        System.out.println(n+ " : "+s);
         double d1 = 20.5;
         short s1 = (short) d1; // alt + enter (shortcut to do casting)
        System.out.println(d1 + ":" + s1);
        float f1 = 30.5f;
        long l1 = (long) f1;





















    }








}
