//package chapter17;
//
//import java.util.Arrays;
//import java.util.List;
//
//public class AlphaNumericsStream {
//    public static void main(String[] args) {
//        //List od Strings that contains string that
//        //are alphaqnumeric. Count the digits in the strings
//        //contained in the list.
//        String[] sequence = {"qwjijjj87", "gw6t71ne90", "h892ndi9"};
//        //int result = countDigitsInStrings(Arrays.asList(sequence));
//   private static long Solution(List<String> words){
//
//       // List<String> words = List.of("qwjijjj87", "gw6t71ne90", "h892ndi9");
//        words.stream()
//                .reduce("",(i,j)->i+j).chars()
//                .filter(Character::isDigit).count();
//        System.out.println(words);
//}
//
//    private static long countDigitsInStrings(List<String> words) {
//        String digits = "013454437";
//        return words.stream()
//                .flatMap((s)->Arrays.stream(s.split("")))
//                .filter(digits::contains)
//                .count()
//    }
//    }
