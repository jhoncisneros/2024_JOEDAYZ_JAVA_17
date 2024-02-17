package pe.joedayz.samples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LegacyDuck implements Comparable{

    private String name;

    public LegacyDuck(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

//    @Override
//    public String toString(){
//        return name;
//    }

    @Override
    public int compareTo(Object obj) {
        LegacyDuck d = (LegacyDuck) obj;
        return name.compareTo(d.name); //ORDEN ASCENDENTE
    }

    public static void main(String[] args) {
        var legacyDucks = new ArrayList<LegacyDuck>();
        legacyDucks.add(new LegacyDuck("Quack"));
        legacyDucks.add(new LegacyDuck("Puddles"));
        Collections.sort(legacyDucks);
        legacyDucks.forEach(x -> System.out.println(x.getName()));
    }
}
