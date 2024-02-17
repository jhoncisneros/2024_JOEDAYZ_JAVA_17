package pe.joedayz.samples;

import java.util.HashMap;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class MainConsumer {

    public static void main(String[] args) {
        Consumer<String> c1 = System.out::println;
        Consumer<String> c2 = x -> System.out.println(x);

        c1.accept("Annie");
        c2.accept("Annie");

        var map = new HashMap<String, Integer>();
        BiConsumer<String, Integer> b1 = map::put;
        BiConsumer<String, Integer> b2 = (k, v) -> map.put(k, v);

        b1.accept("chicken", 7);
        b2.accept("chick",1);

        System.out.println(map);

        var map2 = new HashMap<String, String>();
        BiConsumer<String, String> b11 = map2::put;
        BiConsumer<String, String> b22 = (k, v) -> map2.put(k, v);

        b11.accept("chicken", "Cluck");
        b22.accept("chick", "Tweep");

        System.out.println(map2);

    }
}
