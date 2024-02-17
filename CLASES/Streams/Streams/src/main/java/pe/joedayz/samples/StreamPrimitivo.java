package pe.joedayz.samples;

import java.util.ArrayList;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamPrimitivo {

    private static Stream<Integer> mapping(IntStream stream){
        return stream.mapToObj(x -> x);
    }

    private static Stream<Integer> boxing(IntStream stream){
        return stream.boxed();
    }

    public static void main(String[] args) {

        Stream<Integer> stream = Stream.of(1,2,3);
        System.out.println(stream.reduce(0, (s,n) -> s + n));

        Stream<Integer> stream2 = Stream.of(1,2,3);
        System.out.println(stream2.mapToInt( x -> x).sum());

        IntStream intStream = IntStream.of(1,2,3);
//        int suma = intStream.sum();
//        System.out.println(suma);
        OptionalDouble avg = intStream.average();
        System.out.println(avg.getAsDouble());

        DoubleStream emptu = DoubleStream.empty();
        DoubleStream oneValue = DoubleStream.of(1.0,1.1,1.2);
        oneValue.forEach(System.out::println);

        System.out.println("================================");

        var random = DoubleStream.generate(Math::random);
        random.limit(5).forEach(System.out::println);

        IntStream count = IntStream.iterate(1, n-> n+1).limit(5);
        count.forEach(System.out::println);

        System.out.println("================================");

        IntStream range = IntStream.range(1,5);
        range.forEach(System.out::println);

        System.out.println("================================");

        IntStream rangeClosed = IntStream.rangeClosed(1,5);
        rangeClosed.forEach(System.out::println);

        System.out.println("================================");

        var integerList = new ArrayList<Integer>();
        IntStream ints = integerList.stream().flatMapToInt(x -> IntStream.of(x));
        DoubleStream doubles = integerList.stream().flatMapToDouble(x -> DoubleStream.of(x));
        LongStream longs = integerList.stream().flatMapToLong(x -> LongStream.of(x));

        Stream<String> objStream = Stream.of("pinguino", "fish");
        IntStream intStream1 = objStream.mapToInt(s -> s.length());

        var integerList2 = new ArrayList<Integer>();
        integerList2.add(1);
        integerList2.add(2);
        integerList2.add(3);
        IntStream intStream2 = integerList2.stream().flatMapToInt(x -> IntStream.of(x));
//        Stream<Integer> stream3 = integerList2.stream();
        DoubleStream doubleStream = integerList2.stream().flatMapToDouble(d -> DoubleStream.of(d));

    }
}
