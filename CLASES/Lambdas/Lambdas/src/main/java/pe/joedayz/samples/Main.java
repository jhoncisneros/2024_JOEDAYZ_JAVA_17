package pe.joedayz.samples;

import java.util.List;
import java.util.function.*;

public class Main {

    public static void main(String[] args) {
        Predicate<List> ex1 = x -> "".equals(x.get(0));
        Consumer<Long> ex2 = (Long l) -> System.out.println(l);
        BiPredicate<String, String> ex3 = (s1, s2) -> false;

//        Function<List<String>> ex4 = x -> x.get(0); // NO COMPILA
//        UnaryOperator<Long> ex5 = (Long l) -> 3.14; //NO COMPILA
    }
}
