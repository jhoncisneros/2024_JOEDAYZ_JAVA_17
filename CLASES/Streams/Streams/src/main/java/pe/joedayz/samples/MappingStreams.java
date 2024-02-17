package pe.joedayz.samples;

import java.util.ArrayList;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class MappingStreams {

    public static void main(String[] args) {

        Stream<String> objStream = Stream.of("pinguino","fish");
        IntStream intStream = objStream.mapToInt(s -> s.length());

        var integerList = new ArrayList<Integer>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        IntStream intStream1 = integerList.stream().flatMapToInt(x -> IntStream.of(x));
        IntStream intStream2 = integerList.stream().flatMapToInt(x -> IntStream.of(x));

        DoubleStream doubleStream = integerList.stream().flatMapToDouble(d -> DoubleStream.of(d));

        LongStream longStream = integerList.stream().flatMapToLong(x -> LongStream.of(x));

        Stream<Integer> integerStream = MappingStreams.mapping(intStream1);
        integerStream.forEach(System.out::println);

        System.out.println("===============");

        Stream<Integer> integerStreamBox = MappingStreams.boxing(intStream2);
        integerStreamBox.forEach(System.out::println);

        System.out.println("===============");
        //usando Optional con stream primitivcs
        var streamInt = IntStream.rangeClosed(1,10);
        OptionalDouble optionalDouble = streamInt.average();  //Es para primitivos

        optionalDouble.ifPresent(System.out::println);
        System.out.println(optionalDouble.getAsDouble());
        System.out.println(optionalDouble.orElseGet(() -> Double.NaN));

        System.out.println("===============");

        LongStream longStream1 = LongStream.of(5, 10);
        long sum = longStream1.sum();
        System.out.println(sum);

//        DoubleStream doubleStream1 = DoubleStream.generate(() -> Math.PI);//runs de forma infinita
//        OptionalDouble min = doubleStream1.min(); //runs de forma infinita

        System.out.println("===============");


    }

    private static Stream<Integer> mapping(IntStream stream){
        return stream.mapToObj(x -> x);
    }

    private static Stream<Integer> boxing(IntStream stream){
        return stream.boxed();
    }
}
