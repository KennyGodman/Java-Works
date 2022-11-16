package chapter17;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

//import static java.util.stream.Nodes.collect;
//import static sun.nio.ch.DatagramChannelImpl.AbstractSelectableChannels.forEach;

public class Example2 {
    public static void main(String[] args) {
        List<Woman> women = List.of(
                new Woman("Banke",60),
                new Woman("Godman",100),
                new Woman("Jennifer",60)
        );
        Map<String,Integer> map = new TreeMap<>();
        women.stream()
                .map((woman)-> map.put(woman.getName(),woman.getAge()))
                .collect(Collectors.toList())
                .forEach((age)-> System.out.println(" "));

        System.out.println(map);
    }
}
