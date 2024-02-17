package pe.joedayz.samples;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BusquedaBianria {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(6,9,1,8);
        Collections.sort(list); //1,6,8,9
        System.out.println(list);
        System.out.println(Collections.binarySearch(list, 6)); //1
        System.out.println(Collections.binarySearch(list, 3)); //-2 (-1-1)
        System.out.println(Collections.binarySearch(list, 0)); //-1 (0-1)
        System.out.println(Collections.binarySearch(list, 10)); //-5 (-4-1)=1 6 8 9 10

        var names = Arrays.asList("Min", "Fluffy", "Hoppy");
        Comparator<String> c = Comparator.reverseOrder();
        var index = Collections.binarySearch(names, "Hoppy", c);
        System.out.println(names);
        System.out.println(index); //-1

    }
}
