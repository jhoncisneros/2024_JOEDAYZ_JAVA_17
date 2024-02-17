package pe.joedayz.samples;

import java.util.ArrayList;
import java.util.Collections;

public class MissingDuck implements Comparable<MissingDuck>{

    private String name;

    public MissingDuck(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(MissingDuck quack) {
        if (quack == null)
            throw new IllegalArgumentException("Poorly formed duck!");
        if (this.name == null && quack.name == null)
            return 0;
        else if (this.name == null)
            return -1;
        else if(quack.name == null)
            return 1;
        else
            return name.compareTo(quack.name);
    }

    public static void main(String[] args) {
        var missingDucks = new ArrayList<MissingDuck>();
        missingDucks.add(new MissingDuck(null));
        missingDucks.add(new MissingDuck("Quack"));
        missingDucks.add(new MissingDuck("Puddles"));

        Collections.sort(missingDucks);
        missingDucks.forEach(x -> System.out.println(x.getName()));
    }

}
