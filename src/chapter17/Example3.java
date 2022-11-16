package chapter17;

import java.util.List;

public class Example3 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9);
        list.stream()
                .filter((l)->l % 2 == 1)
                .filter(l->l<2)
                .forEach((n)-> System.out.println(n));
    }
}
