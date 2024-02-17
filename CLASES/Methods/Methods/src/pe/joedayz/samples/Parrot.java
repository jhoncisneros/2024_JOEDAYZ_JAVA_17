package pe.joedayz.samples;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

public class Parrot {

    public static void print(List<Integer> i){
        System.out.println("I");
    }

    public static void print(CharSequence c){
        System.out.println("C");
    }

    public static void print(Object o){
        System.out.println("O");
    }

    public static void main(String[] args) {
        print("abc");
        print(Arrays.asList(3));
        print(LocalDate.of(2022, Month.JULY, 13));

    }
}
