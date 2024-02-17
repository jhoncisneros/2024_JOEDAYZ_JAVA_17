package pe.joedayz.samples;

import java.util.Arrays;
import java.util.List;

public class Division {

    public static void main(String[] args) {
        System.out.println(9/3);
        System.out.println(9%3);

        System.out.println(11/3);
        System.out.println(11%3);

        String[] sa = {"one", "two", "three", "four"};
        List<String> sList = Arrays.asList(sa);
        System.out.println("size "+ sList.size());
        System.out.println("idx2 "+ sList.get(2));



    }
}
