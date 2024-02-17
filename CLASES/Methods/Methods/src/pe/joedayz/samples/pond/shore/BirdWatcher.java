package pe.joedayz.samples.pond.shore;

public class BirdWatcher { //USANDO AL PADRE EN EL MISMO PAQUETE

    public void watchBird(){
        var bird = new Bird();
        bird.floatInWater();
        System.out.println(bird.text);
    }
}
