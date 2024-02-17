package pe.joedayz.samples;

public abstract class Husky {

    abstract void play();
}

interface Poodle{
     void play();
}

class Webby extends Husky {

    @Override
    void play() {

    }
}

class Georgette implements Poodle {

//    @Override
//    void play() { //NO COMPILE
//
//    }

    @Override
    public void play() {

    }
}
