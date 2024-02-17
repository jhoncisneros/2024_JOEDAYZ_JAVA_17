package pe.joedayz.samples.pond.swan;

import pe.joedayz.samples.pond.shore.Bird;

public class Swan extends Bird {

    public void swim(){
        floatInWater();
        System.out.println(text);
    }

    public void helpOtherSwamSwim(){
        Swan other = new Swan();
        other.floatInWater();
        System.out.println(other.text);
    }

    public void helpOtherBirdSwim(){
        Bird bird = new Bird();
//        bird.floatInWater(); //NO COMPILA POR PACKAGE ACCESS
//        System.out.println(bird.text); //NO COMPILA POR PACKAGE ACCESS

    }
}
