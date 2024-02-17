package pe.joedayz.samples;

import java.math.BigDecimal;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Stream;

public class SpliteratorMain {

    public static void main(String[] args) {

        var stream = List.of("bird-", "bunny-","cat-","dog-","fish-","lamb-","mouse-");
        Spliterator<String> original = stream.spliterator();
        Spliterator<String> emma = original.trySplit();

        emma.forEachRemaining(System.out::println);

        System.out.println("================");

        Spliterator<String> jose = original.trySplit();

        jose.forEachRemaining(System.out::println);
        System.out.println("================");

        Spliterator<String> pedro = original.trySplit();
        pedro.tryAdvance(System.out::println);


        System.out.println("================");

        var originalBag = Stream.iterate(1, n -> n+1).spliterator();
        Spliterator<Integer> newBag = originalBag.trySplit();

        newBag.tryAdvance(System.out::println);
        newBag.tryAdvance(System.out::println);
        newBag.tryAdvance(System.out::println);

        System.out.println("================");

        System.out.println(Integer.valueOf(String.valueOf(BigDecimal.ONE)));
        System.out.println(Integer.valueOf(String.valueOf(BigDecimal.ZERO)));
        System.out.println(Integer.valueOf(String.valueOf(BigDecimal.TEN)));
    }
}
