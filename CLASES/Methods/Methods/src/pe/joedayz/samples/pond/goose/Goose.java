package pe.joedayz.samples.pond.goose;

import pe.joedayz.samples.pond.shore.Bird;

public class Goose extends Bird {

    public void helpGooseSwim(){
        Goose other = new Goose();
        other.floatInWater();
        System.out.println(other.text);
    }

    public void helpOtherGooseSwim(){
        Bird other = new Goose();
//        other.floatInWater(); //NO COMPILA
//        System.out.println(other.text); //NO COMPILA

    }

}
