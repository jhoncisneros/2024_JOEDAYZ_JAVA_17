package pe.joedayz.samples;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.BiFunction;

public class MapMain {

    public static void main(String[] args) {

        var map11 = Map.of("key1", "value1", "key2", "value2");
        var map22 = Map.ofEntries(
                Map.entry("key1", "value1"),
                Map.entry("key2", "value2")
        );

        System.out.println(map11);
        System.out.println(map22);

        System.out.println("=============");

        Map<String, String> map = new HashMap<>();
        map.put("koala", "bamboo");
        map.put("lion", "meat");
        map.put("giraffe", "leaf");

        String food = map.get("koala");
        System.out.println(food);

        for (String key : map.keySet())
            System.out.println(key + ",");

        System.out.println("=============");

        Map<String, String> map1 = new TreeMap<>();
        map1.put("koala", "bamboo");
        map1.put("lion", "meat");
        map1.put("giraffe", "leaf");

        String food1 = map1.get("koala");
        System.out.println(food1);

        for (String key : map1.keySet())
            System.out.println(key + ",");

        System.out.println("=============");

//        System.out.println(map.contains("lion")); //NO COMPILA
        System.out.println(map.containsKey("lion")); //true
        System.out.println(map.containsValue("lion")); //false
        System.out.println(map.size()); //3
        map.clear();
        System.out.println(map.size()); //0
        System.out.println(map.isEmpty()); //true

        System.out.println("=============");

        Map<Integer, Character> map2 = new HashMap<>();
        map2.put(1, 'a');
        map2.put(2, 'b');
        map2.put(3, 'c');
        map2.forEach((k,v) -> System.out.println(v));
        map2.values().forEach(System.out::println);
        map2.entrySet().forEach(e ->
                System.out.println(e.getKey() + " " + e.getValue()));

        System.out.println("=============");

        Map<Character, String> map3 = new HashMap<>();
        map3.put('x', "spot");
        System.out.println("X marks the " + map3.get('x'));
        System.out.println("X marks the " + map3.getOrDefault('x', ""));
        System.out.println("Y marks the " + map3.get('y'));
        System.out.println("Y marks the " + map3.getOrDefault('y', ""));

        System.out.println("=============");

        Map<Integer, Integer> map4 = new HashMap<>();
        map4.put(1,2);
        map4.put(2,4);
        Integer original = map4.replace(2, 10);
        System.out.println(original);
        System.out.println(map4);
        map4.replaceAll((k, v) -> k + v);
        System.out.println(map4);

        System.out.println("=============");

        Map<String, String> favorites = new HashMap<>();
        favorites.put("Jenny", "Bus Tour");
        favorites.put("Tom", null);
        System.out.println(favorites);
        favorites.putIfAbsent("Jenny", "Tram");
        favorites.putIfAbsent("Sam", "Tram");
        favorites.putIfAbsent("Tom", "Tram");
        System.out.println(favorites);

        System.out.println("=============");

        BiFunction<String, String, String> mapper = (v1, v2) -> v1.length() > v2.length() ? v1 : v2;
        System.out.println(mapper.apply("2","33"));

        Map<String, String> favorites2 = new HashMap<>();
        favorites2.put("Jenny", "Bus Tour");
        favorites2.put("Tom", "Tram");

        System.out.println(favorites2);

        String jenny = favorites2.merge("Jenny", "Skyride", mapper);
        String tom = favorites2.merge("Tom", "Skyride", mapper);

        System.out.println(favorites2);
        System.out.println(jenny);
        System.out.println(tom);

        System.out.println("=============");

        BiFunction<String, String, String> mapper2 = (v1, v2) -> v1.length() > v2.length() ? v1 : v2;
        System.out.println(mapper2.apply("2","33"));

        Map<String, String> favorites3 = new HashMap<>();
        favorites3.put("Sam", null);

        System.out.println(favorites3);

        String jenny2 = favorites3.merge("Tom", "Skyride", mapper2);
        String tom2 = favorites3.merge("Sam", "Skyride", mapper2);

        System.out.println(favorites3);
        System.out.println(jenny2);
        System.out.println(tom2);

    }
}
