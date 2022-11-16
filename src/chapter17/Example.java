package chapter17;

import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,22,3,4,3,4,5,6,7);
        list.stream()
                .sorted()
                .distinct()// remove duplicate
                .forEach(System.out::println);
    }
}
