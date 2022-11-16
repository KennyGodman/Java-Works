package dataStructure.queue;

import java.util.*;
import java.util.Queue;

public class Example {
    public static void main(String[] args) {
        Queue<String> colors = new PriorityQueue<>();
        colors.add("Blue");
        colors.add("Black");


        Map<String, Integer> map = new HashMap<>();
        map.put ("A", 1);
        map.put("B", 2);

        System.out.println("from queue" + colors);
        System.out.println("from map" + map);

        Set<Integer> nums = new TreeSet<>();
        nums.add(1);
        nums.add(2);
        nums.add(1);

        System.out.println("from set ->" + nums);
    }
}
