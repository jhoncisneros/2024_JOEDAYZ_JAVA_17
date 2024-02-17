package pe.joedayz.samples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Duck implements Comparable<Duck>{

    private String name;

    public Duck(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return name;
    }

    @Override
    public int compareTo(Duck d) {
        return name.compareTo(d.name); //ORDENA ASCENDENTE
//        return d.name.compareTo(name); //ORDENA DESCENDENTE
    }

    public static void main(String[] args) {
        var ducks = new ArrayList<Duck>();
        ducks.add(new Duck("Quack"));
        ducks.add(new Duck("Puddles"));
        Collections.sort(ducks);
        System.out.println(ducks);

//        var lista = new ArrayList<Avatar>();
//        lista.add(new Avatar("Quack"));
//        lista.add(new Avatar("Puddles"));
//        Collections.sort(lista); //NO COMPILA
    }
}
