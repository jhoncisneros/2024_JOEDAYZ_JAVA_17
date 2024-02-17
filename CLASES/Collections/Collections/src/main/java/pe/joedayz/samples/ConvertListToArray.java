package pe.joedayz.samples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertListToArray {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hawk");
        list.add("robin");
        Object[] objectArray = list.toArray();
        String[] stringArray = list.toArray(new String[0]);
        System.out.println(list);
        System.out.println(Arrays.toString(objectArray));
        System.out.println(Arrays.toString(stringArray));

        list.clear();

        System.out.println(list);
        System.out.println(Arrays.toString(objectArray));
        System.out.println(Arrays.toString(stringArray));


    }
}
