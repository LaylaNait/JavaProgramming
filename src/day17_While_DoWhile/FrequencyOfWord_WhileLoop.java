package day17_While_DoWhile;

public class FrequencyOfWord_WhileLoop {
    public static void main(String[] args) {
        String str = "Java Java Python Python";
        int frequency = 0;

        while (str.contains("Java")){
           str = str.replace("Java","");
           frequency++;
        }
        System.out.println(frequency);
        System.out.println("-------------------------------------------");

        String sentence = "cat cat cat cat dog dog dog cat cat";
        int countCat = 0; // loop exceted first time cuntCat=1 2end time countCat = 2

        while (sentence.contains("cat")){ // it become false when we don't have word cat
           sentence = sentence.replaceFirst("cat","");
            countCat++;
        }
        System.out.println(countCat);
        System.out.println("--------------------------------------------------------------");






    }
}
