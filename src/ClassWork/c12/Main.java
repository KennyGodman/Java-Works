package ClassWork.c12;

public class Main {
    public static void main(String[] args) {
        //equals
        String word = "Hello";
        String secondWord = new String("Hello");
        System.out.println("word --> " + word);
        System.out.println(" second word --> " + secondWord);
       // System.out.println(word == secondWord);
        System.out.printf("%s %b\n", "with == operator::: " , word==secondWord);
        System.out.println(("with equals in class String:: " + word).equals(secondWord));
    }
}
