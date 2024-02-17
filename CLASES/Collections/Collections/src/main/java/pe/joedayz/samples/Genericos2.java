package pe.joedayz.samples;

import java.util.List;

public class Genericos2 {

    private void anyFlyer(List<Flyer> flyer){}

    private void groupOfFlyers(List<? extends Flyer> flyer){}
}

interface Flyer {
    void fly();
}

class HangGlider implements Flyer {

    @Override
    public void fly() {}
}

class Goose implements Flyer{

    @Override
    public void fly() {}
}
