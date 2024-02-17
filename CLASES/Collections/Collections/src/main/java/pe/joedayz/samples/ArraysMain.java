package pe.joedayz.samples;

import java.util.Arrays;
import java.util.List;

public class ArraysMain {

    public static void main(String[] args) {

        Integer[] arrayInt = new Integer[]{1, 2, 3};

        String[] array = new String[]{"a", "b", "c"};
        Arrays.stream(array).forEach(System.out::println);

        System.out.println("=====================");

        List<String> asList = Arrays.asList(array);
        asList.forEach(System.out::println);

        System.out.println("=====================");

        List<String> of = List.of(array);
        of.forEach(System.out::println);

        System.out.println("=====================");

        List<String> copy = List.copyOf(asList);
        copy.forEach(System.out::println);

        System.out.println("=====================");

        array[0] = "z";
        array[2] = "x";
        Arrays.stream(array).forEach(System.out::println);
        System.out.println("=====================");
        asList.forEach(System.out::println);
        System.out.println("=====================");
        of.forEach(System.out::println);
        System.out.println("=====================");
        copy.forEach(System.out::println);
        System.out.println("=====================");

        asList.set(0,"y");
        asList.set(2,"v");

//        asList.add("s"); //NO COMPILA
//        of.add("s"); //NO COMPILA
//        copy.add("s"); //NO COMPILA

//        of.set(0, "s"); //NO COMPILA
//        copy.set(0, "s"); //NO COMPILA

//        System.out.println(Arrays.toString(array));
        Arrays.stream(array).forEach(System.out::println);
        System.out.println("=====================");
        asList.forEach(System.out::println);
        System.out.println("=====================");
        of.forEach(System.out::println);
        System.out.println("=====================");
        copy.forEach(System.out::println);
        System.out.println("=====================");

//        copy.add("r"); //UnsupportedOperationException en tiempo de EJECUCION
    }
}
