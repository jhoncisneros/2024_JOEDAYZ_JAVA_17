package pe.joedayz.samples;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SampleStream {

    public static void main(String[] args) {

        Stream<String> empty = Stream.empty();
        Stream<Integer> singleElement = Stream.of(1);
        Stream<Integer> fromArray = Stream.of(1,2,3);

        var list = List.of("a", "b", "c");
        Stream<String> fromList = list.stream(); //para streams pequeños de datos
        Stream<String> fromListParallel = list.parallelStream(); //para streams grandes de datos es bueno

        Stream<Double> randoms = Stream.generate(Math::random); //INFINITO
//        randoms.forEach(System.out::println);
        Stream<Integer> oddNumbers = Stream.iterate(1,n -> n + 2); //VA DE 2 EN 2 INFINITO
//        oddNumbers.forEach(System.out::println);

        System.out.println(oddNumbers);

        Stream<Integer> oddNumberUnder100 = Stream.iterate(
                1, //SEED
                     n -> n < 100, //PREDICATE
                     n -> n + 2); // UNARYOPERATOR
        oddNumberUnder100.forEach(System.out::println);

        System.out.println("==========================");

        Stream<String> s = Stream.of("monkey", "gorila", "bonobo");
        System.out.println(s.count());

        Stream<String> sa = Stream.of("monkey", "ape", "bonobo");
        Optional<String> min = sa.min((s1, s2) -> s1.length() - s2.length());
        min.ifPresent(System.out::println);

//        Optional<String> max = sa.max((s1, s2) -> s1.length() - s2.length()); //ERROR EN TIEMPO DE EJECUCION IllegalStateException
//        max.ifPresent(System.out::println);                                    //El Stream ya ha sido cerrado

        Stream<Integer> numbers = Stream.of(3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5);
        Optional<Integer> min2 = numbers.min(Integer::compareTo);
        min2.ifPresent(System.out::println);

        Optional<?> minEmpty = Stream.empty().min((s1, s2) -> 0);
        System.out.println(minEmpty.isPresent());
        minEmpty.ifPresent(System.out::println); //NO PINTA NADA

        Stream<String> sb = Stream.of("monkey", "gorila", "bonobo");
        Stream<String> infinite = Stream.generate(() -> "chimp");

        sb.findAny().ifPresent(System.out::println);
        infinite.findAny().ifPresent(System.out::println);

        System.out.println("==========================");

        var list2 = List.of("monkey", "2", "chimp");
        Stream<String> infinite2 = Stream.generate(() -> "chimp");
        Predicate<String> pred = x -> Character.isLetter(x.charAt(0));

        System.out.println(list2.stream().anyMatch(pred));
        System.out.println(list2.stream().allMatch(pred));
        System.out.println(list2.stream().noneMatch(pred));
        System.out.println("==========================");
        System.out.println(infinite2.anyMatch(pred));
//        System.out.println(infinite2.allMatch(pred)); //ERROR EN EJECUCION
//        System.out.println(infinite2.noneMatch(pred)); //ERROR EN EJECUCION

        System.out.println("==========================");

        Stream<String> sc = Stream.of("Monkey", "Gorilla", "Bonobo");
        sc.forEach(System.out::println);

        Stream<Integer> sd = Stream.of(1);
//        for (Integer i : sd){} //NO COMPILA

        System.out.println("==========================");

        var array = new String[]{"j", "o", "e", "d", "a", "y", "z"};
        var result = "";
        for (var c : array)
            result = result + c;
        System.out.println(result);

        Stream<String> stream = Stream.of("j", "o", "e", "d", "a", "y", "z");
        String reduce = stream.reduce("", (str, c) -> str + c);
        System.out.println(reduce);

        stream = Stream.of("j", "o", "e", "d", "a", "y", "z");
        String reduce1 = stream.reduce("", String::concat);
        System.out.println(reduce1);

        Stream<Integer> integerStream = Stream.of(3,5,6);
        Integer reduce2 = integerStream.reduce(1, (a, b) -> a * b);
        System.out.println(reduce2);

        BinaryOperator<Integer> op = (a, b) -> a * b;
        Stream<Integer> empty2 = Stream.empty();
        Stream<Integer> oneElement = Stream.of(3);
        Stream<Integer> threeElements = Stream.of(3,5,6);

        empty2.reduce(op).ifPresent(System.out::println); //NO PINTA
        oneElement.reduce(op).ifPresent(System.out::println);
        threeElements.reduce(op).ifPresent(System.out::println);

        //cuando trabajas con disintos tipos
        //java crea reducciones intermedias y luego las combina todas al final
        //El reduce con 3 argumentos es util cuando se trabaja con streams parallel
        Stream<String> stream1 = Stream.of("w","o","l","f!");
        int length = stream1.reduce(0, (i, j) -> i + j.length(), (a, b) -> a + b);
        System.out.println(length);

        System.out.println("==========================");

        Stream<String> stream2 = Stream.of("w","o","l","f");
        StringBuilder word = stream2.collect(
                StringBuilder::new,
                StringBuilder::append,
                StringBuilder::append
        );
        System.out.println(word);

        Stream<String> stream3 = Stream.of("w","o","l","f");
        TreeSet<String> set2 = stream3.collect(
                TreeSet::new,
                TreeSet::add,
                TreeSet::addAll
        );
        System.out.println(set2);

        Stream<String> stream4 = Stream.of("w", "o","l","f");
        TreeSet<String> set3 = stream4.collect(Collectors.toCollection(TreeSet::new));
        System.out.println(set3);

        Stream<String> stream5 = Stream.of("w", "o","l","f");
        Set<String> set4 = stream5.collect(Collectors.toSet());
        System.out.println(set4);
    }
}
