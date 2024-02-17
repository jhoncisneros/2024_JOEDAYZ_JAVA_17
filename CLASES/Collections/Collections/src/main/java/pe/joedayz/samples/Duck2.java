package pe.joedayz.samples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Duck2 implements Comparable<Duck2>{

    private String name;
    private int weight;

    public int getWeight() {
        return weight;
    }

    public Duck2(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Duck2 d) {
        return name.compareTo(d.name);
    }

    public static void main(String[] args) {
        Comparator<Duck2> byWeight = new Comparator<Duck2>() {
            @Override
            public int compare(Duck2 d1, Duck2 d2) {
                return d1.getWeight() - d2.getWeight();
            }
        };

        Comparator<Duck2> byWeight2 = (d1, d2) -> d1.getWeight() - d2.getWeight();

        Comparator<Duck2> byWeight3 = Comparator.comparing(Duck2::getWeight);

        var ducks = new ArrayList<Duck2>();
        ducks.add(new Duck2("Quack", 7));
        ducks.add(new Duck2("Puddles", 10));
        System.out.println(ducks);
        Collections.sort(ducks);
        System.out.println(ducks);
        Collections.sort(ducks, byWeight);
        System.out.println(ducks);
        Collections.sort(ducks, byWeight2);
        System.out.println(ducks);
        Collections.sort(ducks, byWeight3);
        System.out.println(ducks);
    }
}
