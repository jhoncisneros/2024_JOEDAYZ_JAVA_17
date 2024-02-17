package pe.joedayz.samples.pond.duck;

import pe.joedayz.samples.pond.goose.Goose;

public class GooseWatcher {

    public void watch(){
        Goose other = new Goose();
//        other.floatInWater(); //NO COMPILA poor ser protected
//        System.out.println(other.text); //NO COMPILA por ser protected
    }
}
