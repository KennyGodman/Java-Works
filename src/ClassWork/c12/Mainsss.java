package ClassWork.c12;

import java.util.Arrays;

public class Mainsss {
    public static void main(String[] args) {
        String firstWord = "There are unicorns in cohort twelve";
        //String firstWord = "There are unicORns in cohort twelve";
        System.out.println(firstWord.regionMatches(10, "unicorns", 0, 7));
       // System.out.println(firstWord.regionMatches(true,10, "unicorns", 0, 7));
        char [] chars = "Hello".toCharArray();
        System.out.println(Arrays.toString(chars));


    }
}
