package chapter17;

import java.util.List;

//package chapter17;
//
//import java.util.Arrays;
//import java.util.Comparator;
//import java.util.List;
//
//public class Example9 {
//    public static void main(String[] args) {
//        //List od Strings that contains string that
//        //are alphaqnumeric. Count the digits in the strings
//        //contained in the list.
//        String[] sequence = {"qwjijjj87", "gw6t71ne90", "h892ndi9"};
//        int result = countDigits(Arrays.asList(sequence));
//        System.out.println(result);
//    }
//
//    private static int countDigits(List<String> list) {
//        int counter = 0;
//        for (String str : list) {
//            for ( i = 0, i <str.length(); i++;){
//                if (Character.isDigit(str.charAt(i))) counter++;
//            }
//        }
//        return counter;
//    }
//}
//
////                .sorted(Comparator.comparing(number).thenComparing(alphabet));;
public class Example9 {
    public static void main(String[] args) {}
        public static void count (List< String > count) {
            System.out.println(count.stream().reduce("", (i, j) -> i + j).chars().filter(Character::isDigit).count());
        }

}