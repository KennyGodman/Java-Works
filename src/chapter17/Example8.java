//package chapter17;
//
//import java.util.Comparator;
//import java.util.List;
//import java.util.stream.Collectors;
//
//public class Example8 {
//    public static void main(String[] args) {
//        List<Integer> list = List.of(12,13,45,15,16,7);
//        var result=list.stream()
//                .peek(System.out::print);
////                .collect(Collectors.toList());
//      //  System.out.println(result);
//
//        //skip
//        List<String> words = List.of("AAA", "BBB", "BCCD", "HELLO");
//        words.stream()
//                .skip(n:2)
////                .forEach(System.out::println);
//
//        var sortedInDescendingOrder  =
//                   list.stream()
//                           .sorted(Comparator.reverseOrder())
//                           .collect(Collectors.toList());
//        System.out.println(sortedInDescendingOrder);
//
//    }
//}
