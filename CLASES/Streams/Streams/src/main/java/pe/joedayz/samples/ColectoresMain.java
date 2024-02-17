package pe.joedayz.samples;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class ColectoresMain {

    record Separations(String spaceSeparated, String commaSeparated){}

    public static void main(String[] args) {

        var ohMy = Stream.of("lions", "tigers", "bears");
        String result = ohMy.collect(Collectors.joining(", "));

        System.out.println(result);

        System.out.println("==========");

        var ohMy2 = Stream.of("lions", "tigers", "bears");
        Double result2 = ohMy2.collect(Collectors.averagingInt(String::length));

        System.out.println(result2);

        System.out.println("==========");

        var ohMy3 = Stream.of("lions", "tigers", "bears");
        TreeSet<String> result3 = ohMy3
                .filter(s -> s.startsWith("t"))
                .collect(Collectors.toCollection(TreeSet::new));

        System.out.println(result3);

        System.out.println("==========");

        var ohMy4 = Stream.of("lions", "tigers", "bears");
        Map<String, Integer> map = ohMy4.collect(Collectors.toMap(s -> s, String::length));

        System.out.println(map);

        System.out.println("==========");

//        var ohMy5 = Stream.of("lions", "tigers", "bears");
//        Map<Integer, String> map2 = ohMy5.collect(Collectors.toMap(String::length, k -> k)); // ERROR EJECUCION java.lang.IllegalStateException

        var ohMy6 = Stream.of("lions", "tigers", "bears");
        Map<Integer, String> map2 = ohMy6.collect(Collectors.toMap(
                String::length,
                k -> k,
                (s1, s2) -> s1 + "," + s2
        ));

        System.out.println(map2);
        System.out.println(map2.getClass()); //class java.util.HashMap

        System.out.println("==========");

        var ohMy7 = Stream.of("lions", "tigers", "bears");
        TreeMap<Integer, String> map3 = ohMy7.collect(Collectors.toMap(
                String::length,
                k -> k,
                (s1, s2) -> s1 + "," + s2,
                TreeMap::new
        ));

        System.out.println(map3);
        System.out.println(map3.getClass()); //class java.util.TreeMap

        System.out.println("==========");

        var ohMy8 = Stream.of("lions", "tigers", "bears");
        Map<Integer, Set<String>> map4 = ohMy8.collect(
                Collectors.groupingBy(
                  String::length,
                  Collectors.toSet()
                )
        );

        System.out.println(map4);
        System.out.println(map4.getClass());

        System.out.println("================");

        var ohMy9 = Stream.of("lions", "tigers", "bears");
        TreeMap<Integer, Set<String>> map5 = ohMy9.collect(
                Collectors.groupingBy(
                        String::length,
                        TreeMap::new,
                        Collectors.toSet()
                )
        );

        System.out.println(map5);
        System.out.println(map5.getClass());

        System.out.println("================");

        var ohMy10 = Stream.of("lions", "tigers", "bears");
        Map<Integer, List<String>> map6 = ohMy10.collect(
                Collectors.groupingBy(String::length)
        );

        System.out.println(map6);
        System.out.println(map6.getClass());

        System.out.println("================");

        var ohMy11 = Stream.of("lions", "tigers", "bears");
        TreeMap<Integer, List<String>> map7 = ohMy11.collect(
                Collectors.groupingBy(
                        String::length,
                        TreeMap::new,
                        Collectors.toList()
                )
        );

        System.out.println(map7);
        System.out.println(map7.getClass());

        System.out.println("================");

        var ohMy12 = Stream.of("lions", "tigers", "bears");
        Map<Boolean, List<String>> map8 = ohMy12.collect(
                Collectors.partitioningBy(s -> s.length() <= 5)
        );

        System.out.println(map8);
        System.out.println(map8.getClass());

        System.out.println("================");

        var ohMy13 = Stream.of("lions", "tigers", "bears");
        Map<Boolean, Set<String>> map9 = ohMy13.collect(
                Collectors.partitioningBy(
                        s -> s.length() <= 7,
                        Collectors.toSet()
                )
        );

        System.out.println(map9);
        System.out.println(map9.getClass());

        System.out.println("================");

        var ohMy14 = Stream.of("lions", "tigers", "bears");
        Map<Boolean, List<String>> map10 = ohMy14.collect(
                Collectors.partitioningBy(s -> s.length() <= 7)
        );

        System.out.println(map10);
        System.out.println(map10.getClass());

        System.out.println("================");

        var ohMy15 = Stream.of("lions", "tigers", "bears");
        Map<Integer, Long> map11 = ohMy15.collect(
                Collectors.groupingBy(
                        String::length,
                        Collectors.counting()
                )
        );

        System.out.println(map11);
        System.out.println(map11.getClass());

        System.out.println("================");

        var ohMy16 = Stream.of("lions", "tigers", "bears");
        var map12 = ohMy16.collect(
                groupingBy(
                        String::length,
                        mapping(s -> s.charAt(0), minBy((a, b) -> a -b))
                )
        );

        System.out.println(map12);
        System.out.println(map12.getClass());

        System.out.println("================");

        var ohMy17 = Stream.of("lions", "tigers", "bears");
        Map<Integer, Optional<Character>> map13 = ohMy17.collect(
                Collectors.groupingBy(
                        String::length,
                        Collectors.mapping(
                                s -> s.charAt(0),
                                Collectors.minBy((a, b) -> a -b)
                        )
                )
        );

        System.out.println(map13);
        System.out.println(map13.getClass());

        System.out.println("================");

        var list = List.of("x", "y", "z");
        Separations result15 = list.stream()
                .collect(Collectors.teeing(
                        Collectors.joining(" "),
                        Collectors.joining(","),
                        (s, c) -> new Separations(s, c)
                ));

        System.out.println(result15);
        System.out.println(result15.getClass());
    }


}
