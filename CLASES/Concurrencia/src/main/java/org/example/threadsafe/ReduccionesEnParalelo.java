package org.example.threadsafe;

import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReduccionesEnParalelo {

    public static void main(String[] args) {

        System.out.println(List.of(1,2,3,4,5,6).stream()
                .findAny().get()); // 1

        System.out.println(List.of(1,2,3,4,5,6).parallelStream()
                .findAny().get()); // 4 u otro

        System.out.println(List.of('w', 'o', 'l', 'f')
                .stream()
                .reduce("", (s1, c) -> s1 + c, (s2,s3) -> s2 + s3)); // wolf

        System.out.println(List.of('w', 'o', 'l', 'f')
                .parallelStream()
                .reduce("", (s1, c) -> s1 + c, (s2,s3) -> s2 + s3)); // wolf u otro

        System.out.println(List.of(1,2,3,4,5,6)
                .parallelStream().reduce(0, (a,b) -> (a-b))); // 3 u otro

        System.out.println(List.of("w", "o", "l", "f")
                .stream()
                .reduce("X", String::concat)); // Xwolf

        System.out.println(List.of("w", "o", "l", "f")
                .parallelStream()
                .reduce("X", String::concat)); // XwXoXlXf

        Stream<String> stream = Stream.of("w", "o", "l", "f").parallel();
        SortedSet<String> set = stream.collect(ConcurrentSkipListSet::new, Set::add, Set::addAll);
        System.out.println(set); // [f, l, o, w]

        Stream<String> ohMy = Stream.of("lions", "tigers", "bears").parallel();
        ConcurrentMap<Integer, String> map = ohMy.collect(
                Collectors.toConcurrentMap(String::length, k->k, (s1,s2)-> s1 + "," + s2));

        System.out.println(map); // {5=lions,bears, 6=tigers
        System.out.println(map.getClass()); // class java.util.concurrent.ConcurrentHashMap

        Stream<String> ohMy2 = Stream.of("lions", "tigers", "bears").parallel();
        ConcurrentMap<Integer, List<String>> map2 = ohMy2.collect(
                Collectors.groupingByConcurrent(String::length));

        System.out.println(map2); // {5=[lions, bears], 6=[tigers]}
        System.out.println(map2.getClass()); // class java.util.concurrent.ConcurrentHashMap

    }
}
