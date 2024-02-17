package pe.joedayz.samples.pond.swan;

import pe.joedayz.samples.pond.duck.MotherDuck;

public class BadCygnet {

    public void makeNoise(){
        var duck = new MotherDuck();
//        duck.quack(); //NO COMPILA POR PACKAGE ACCESS
//        System.out.println(duck.noise); //NO COMPILA POR PACKAGE ACCESS

    }
}
