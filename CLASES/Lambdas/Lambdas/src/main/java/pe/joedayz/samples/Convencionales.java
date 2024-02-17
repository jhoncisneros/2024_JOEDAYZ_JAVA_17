package pe.joedayz.samples;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.DoubleToIntFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class Convencionales {

    public void whatAmi() {
        consume((var x) -> System.out.println(x), 123);
    }

    public void consume(Consumer<Integer> c, int num){
        c.accept(num);
    }

    public void counts(List<Integer> list){
        list.sort((var x, var y) -> x.compareTo(y));
    }

    public static void main(String[] args) {

        Predicate<String> egg = s -> s.contains("egg");
        Predicate<String> brown = s -> s.contains("brown");

        Predicate<String> brownEggs = s -> s.contains("egg") && s.contains("brown");
        Predicate<String> otherEggs = s -> s.contains("egg") && !s.contains("brown");

        Predicate<String> brownEggs2 = egg.and(brown);
        Predicate<String> otherEggs2 = egg.and(brown.negate());

        Consumer<String> c1 = x -> System.out.print("1: " + x);
        Consumer<String> c2 = x -> System.out.print(",2" + x);

        Consumer<String> combined = c1.andThen(c2);
        combined.accept("Annie");

        Function<Integer, Integer> before = x -> x + 1;
        Function<Integer, Integer> after = x -> x * 2;

        Function<Integer, Integer> combined2 = after.compose(before);
        System.out.println(before.apply(3));
        System.out.println(after.apply(3));
        System.out.println(combined2.apply(3));

        Predicate<String> p = x -> true;
        Predicate<String> p2= (var x) -> true;
        Predicate<String> p3 = (String x) -> true;

        var d = 1.0;
        DoubleToIntFunction f1 = x -> 1;
        f1.applyAsInt(d);
    }
}
