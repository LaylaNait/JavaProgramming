package day15ForLoop;

public class StringMethod {
    public static void main(String[] args) {
        String str = " "; // it's not empty because we have spaces it is blank because we have white space
        boolean r = str.isEmpty();//false if it has space true if there is no space and np character
        System.out.println(r);
       boolean r1 = str.isBlank(); // true if it has space and if it has no character
        System.out.println(r1);
        System.out.println("-------------------------------------------------");

        String s1 = "CYDEO";
        String s2 = "cydeo";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));//true
        System.out.println("-------------------------------------------");
        String sentence = "My favorite programing language is java";
       boolean hasCSharp = sentence.contains("C#");
       boolean hasJava = sentence.contains("java");
       boolean hasJava2 = sentence.contains("Java");
       boolean hasJava3 = sentence.toLowerCase().contains("Java");
       boolean r3 = sentence.contains("java") || sentence.contains("Java");
        System.out.println(hasCSharp);
        System.out.println(hasJava2);
        System.out.println(hasJava);
        System.out.println(hasJava3);
        System.out.println(r3);
        System.out.println("-------------------------------------------");


        System.out.println("--------------------------------------------------");
        String a = "Wooden Spoon";
        boolean x = a.startsWith("Woo");
        boolean y = a.endsWith("Spoon");
        boolean z = a.toLowerCase().startsWith("wooden"); //in order to ignore the case sensitivity we first create the
                                                         // lower case/upper  case version
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);







    }
}
