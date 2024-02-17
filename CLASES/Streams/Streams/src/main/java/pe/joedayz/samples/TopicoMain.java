package pe.joedayz.samples;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.*;

public class TopicoMain {

    public static void main(String[] args) {

//        var stream = Stream.iterate("", (s) -> s + "1");
//        System.out.println(stream.limit(2).map(x -> x + 2));

        System.out.println("===============");

//        Predicate<String> predicate = s -> s.startsWith("g");
//        var stream1 = Stream.generate(() -> "growl!");
//        var stream2 = Stream.generate(() -> "growl!");

//        var b1 = stream1.anyMatch(predicate);
//        var b2 = stream2.allMatch(predicate);
//        System.out.println(b1 + " " + b2);

        System.out.println("===============");

//        Predicate<String> predicateA = s -> s.length() > 3;
//        var streamA = Stream.iterate("-", s -> ! s.isEmpty(), (s) -> s + s);
//        var b1A = streamA.noneMatch(predicateA);
//        var b2A = streamA.anyMatch(predicateA); //ERROR EN TIEMPO DE EJECUCION ILLEGAL STATE EXCEPTION
//        System.out.println(b1A + " " + b2A);

        System.out.println("===============");

//        double resultA = LongStream.of(6L, 8L, 10L)
//                .mapToInt(x -> (int) x)
//                .collect(Collectors.groupingBy(x -> x)) //ERROR DESDE ESTA PARTE
//                .keySet()
//                .stream()
//                .collect(Collectors.averagingInt(x -> x));

//        double resultB = LongStream.of(6L, 8L, 10L)
//                .mapToInt(x -> x) //ERROR EN ESTA PARTE
//                .boxed()
//                .collect(Collectors.groupingBy(x -> x))
//                .keySet()
//                .stream()
//                .collect(Collectors.averagingInt(x -> x));

        double resultC = LongStream.of(6L, 8L, 10L)
                .mapToInt(x -> (int) x)
                .boxed()
                .collect(Collectors.groupingBy(x -> x))
                .keySet()
                .stream()
                .collect(Collectors.averagingInt(x -> x));

        System.out.println(resultC);

//        double resultD = LongStream.of(6L, 8L, 10L)
//                .mapToInt(x -> (int) x)
//                .collect(Collectors.groupingBy(x -> x, Collectors.toSet())) //ERROR DESDE AQUI
//                .keySet()
//                .stream()
//                .collect(Collectors.averagingInt(x -> x));

//        double resultE = LongStream.of(6L, 8L, 10L)
//                .mapToInt(x -> x)//NO COMPILA EN ESTA PARTE
//                .boxed()
//                .collect(Collectors.groupingBy(x -> x, Collectors.toSet()))
//                .keySet()
//                .stream()
//                .collect(Collectors.averagingInt(x -> x));

        double resultF = LongStream.of(6L, 8L, 10L)
                .mapToInt(x -> (int) x)
                .boxed()
                .collect(Collectors.groupingBy(x -> x, Collectors.toSet()))
                .keySet()
                .stream()
                .collect(Collectors.averagingInt(x -> x));

        System.out.println(resultF);

        System.out.println("===============");

        var s = Stream.generate(() -> "meow");
        var match = s.allMatch(String::isEmpty); //false
//        var match = s.anyMatch(String::isEmpty); //infinito
//        var match = s.findAny(String::isEmpty); //ERROR COMPILACION
//        var match = s.findFirst(String::isEmpty); //ERROR DE COMPILACION
        System.out.println(match);

        System.out.println("===============");

        List<String> list = Arrays.asList("7","6","8","9");
        var copy = new ArrayList<String>(list);
        Collections.sort(copy, (a, b) -> b.compareTo(a));
        System.out.println(copy);

        System.out.println(
                list.stream()
                .sorted((a, b) -> b.compareTo(a))
                .collect(Collectors.toList())
        );

        System.out.println("===============");

        var is = IntStream.empty();
//        System.out.println(is.average()); //OptionalDouble.empty
//        System.out.println(is.findAny()); //OptionalInt.empty
        System.out.println(is.sum()); //0

        System.out.println("===============");

        var stream9 = LongStream.of(1, 2, 3);
        var opt = stream9.map(n -> n * 10)
                .filter(n -> n < 5)
                .findFirst();

//        if(opt.isPresent())
//            System.out.println(opt.get()); //ERROR EN COMPILACION

        if(opt.isPresent())
            System.out.println(opt.getAsLong());

//        opt.ifPresent(System.out.println); //ERROR EN COMPÏLACION
        opt.ifPresent(System.out::println);

        System.out.println("===============");

        Stream.generate(() -> "1")
                .limit(10)
//                .peek(System.out::println)
//                .filter(x -> x.length() > 1)
                .forEach(System.out::println);

        System.out.println("===============");

        System.out.println(
            Stream.iterate(1, x -> ++x)
                .limit(5)
                .map(x -> "" + x)
                .collect(Collectors.joining())
        );

        System.out.println("===============");

        Set<String> birds = Set.of("oriole", "flamingo");
        Stream.concat(birds.stream(),
//                birds.stream(),
                birds.stream())
                .sorted()
                .distinct()
                .findAny()
                .ifPresent(System.out::println);

        System.out.println("===============");

        List<Integer> x1 = List.of(1, 2, 3);
        List<Integer> x2 = List.of(4, 5, 6);
        List<Integer> x3 = List.of();

        Stream.of(x1, x2, x3)
                .map(x -> x )
                .flatMap(x -> x.stream())
                .forEach(System.out::print);

        System.out.println("===============");

        Stream<Integer> s4 = Stream.of(1);
//        IntStream is5 = s4.boxed(); //NO COMPILA
        DoubleStream ds6 = s4.mapToDouble(x -> x);
//        Stream<Integer> s27 = ds6.mapToInt(x -> x); //NO COMMPILA

        System.out.println("===============");

        Predicate<String> empty = String::isEmpty;
        Predicate<String> notEmpty = empty.negate();
    }

}
