package pe.joedayz.samples;

import java.io.IOException;
import java.util.*;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class Statistics {

    public static void main(String[] args) {

        var cats = new ArrayList<String>();
        cats.add("Annie");
        cats.add("Ripley");

        var stream = cats.stream();
        cats.add("KC");

        System.out.println(stream.count());

        Statistics.threeDigit(Optional.of(100));
        Statistics.threeDigit2(Optional.of(100));

        Optional<Integer> result = Optional.of("Hola").map(String::length);
        System.out.println(result);

    }

    private static int max(IntStream ints){

        OptionalInt optionalInt = ints.max();
        return optionalInt.orElseThrow(RuntimeException::new);
    }

    private static int range(IntStream ints){

        IntSummaryStatistics intSummaryStatistics = ints.summaryStatistics();
        if(intSummaryStatistics.getCount() == 0)
            throw new RuntimeException();
        return intSummaryStatistics.getMax() - intSummaryStatistics.getMin();
    }

    private static void threeDigit(Optional<Integer> optional){
        if(optional.isPresent()){
            var num = optional.get();
            var string = "" + num;
            if(string.length() == 3){
                System.out.println(string);
            }
        }
    }

    private static void threeDigit2(Optional<Integer> optional){
        optional.map(n -> "" + n)
                .filter(s -> s.length() == 3)
                .ifPresent(System.out::println);
    }


}

