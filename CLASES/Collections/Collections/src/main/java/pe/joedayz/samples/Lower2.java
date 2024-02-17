package pe.joedayz.samples;

import java.util.ArrayList;
import java.util.List;

public class Lower2 {

    private static void addSound(List<? super String> list){
        list.add("quack");
    }

    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();
        strings.add("tweet");

        List<Object> objects = new ArrayList<>(strings);
        addSound(strings);
        addSound(objects);

        System.out.println(strings);
        System.out.println(objects);
    }
}
