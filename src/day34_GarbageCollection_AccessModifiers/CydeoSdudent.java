package day34_GarbageCollection_AccessModifiers;

public class CydeoSdudent {

   public String StudentName ;
   public static String schoolName;

    public CydeoSdudent(String studentName) {
        StudentName = studentName;
    }
    static {
        schoolName = "Cydeo School";
    }


    public static void main(String[] args) {
        CydeoSdudent sdudent = new CydeoSdudent("Layla");
    }
}
