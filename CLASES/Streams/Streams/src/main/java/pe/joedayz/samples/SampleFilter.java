package pe.joedayz.samples;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class SampleFilter {

    public static void main(String[] args) {

        Stream<String> s = Stream.of("monkey", "gorila", "bonobo");
        s.filter(x -> x.startsWith("m")).forEach(System.out::println);

        Stream<String> s1 = Stream.of("duck", "duck", "duck", "goose");
        s1.distinct().forEach(System.out::println);

        Stream<Integer> s2 = Stream.iterate(1, n -> n + 1);
        s2.skip(5).limit(2).forEach(System.out::println);

        System.out.println("============================");

        Stream<String> s3 = Stream.of("monkey", "gorilla", "bonobo");
        s3.map(String::length).forEach(System.out::println);

        System.out.println("============================");

        List<String> zero = List.of();
        var one = List.of("Bonobo");
        var two = List.of("Mama Gorilla", "Baby Gorilla");
        Stream<List<String>> animals = Stream.of(zero, one, two);
//        animals.forEach(System.out::println);
        animals.flatMap(m -> m.stream()).forEach(System.out::println);

        System.out.println("============================");

        var one2 = Stream.of("Bonobo");
        var two2 = Stream.of("Mama Gorilla", "Baby Gorilla");
        Stream.concat(one2, two2).forEach(System.out::println);

        System.out.println("============================");

        Stream<String> s4 = Stream.of("brown-", "bear-");
        s4.sorted().forEach(System.out::println);

        Stream<String> s5 = Stream.of("brown bear-", "grizzly-");
        s5.sorted(Comparator.reverseOrder()).forEach(System.out::println);

        Stream<String> s6 = Stream.of("brown bear-", "grizzly-");
//        s6.sorted(Comparator::reverseOrder); //NO COMPILA porque retorna un Comparator y no un int

        System.out.println("============================");

        var stream = Stream.of("black bear", "brown bear", "grizzly");
        long count = stream.filter(sa -> sa.startsWith("g")).peek(System.out::println).count();
        System.out.println(count);

        System.out.println("============================");

        var numbers = new ArrayList<>();
        var letters = new ArrayList<>();
        numbers.add(1);
        letters.add('a');
        Stream<List<?>> stream2 = Stream.of(numbers, letters);

        stream2.map(List::size).forEach(System.out::println);
//        stream2.peek(x -> x.remove(0)).map(List::size).forEach(System.out::println); //TENER CUIDADO NO ES RECOMENDABLE MODIFICAR EN EL PEEK

        System.out.println("============================");



    }
}
