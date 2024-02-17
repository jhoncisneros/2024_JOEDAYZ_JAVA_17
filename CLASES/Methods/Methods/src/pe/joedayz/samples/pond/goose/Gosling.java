package pe.joedayz.samples.pond.goose;

import pe.joedayz.samples.pond.shore.Bird;

public class Gosling extends Bird { //POR HERENCIA

    public void swim(){
        floatInWater();
        System.out.println(text);

        var bird = new Bird();
//        bird.floatInWater(); //NO COMPILA
//        System.out.println(bird.text); //NO COMPILA
    }

    public static void main(String[] args) {
        new Gosling().swim();
    }
}
