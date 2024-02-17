package pe.joedayz.samples.pond.duck;

public class GoodDuckling {

    public void makeNoise(){
        var duck = new MotherDuck();
        duck.quack();
        System.out.println(duck.noise);
    }
}
