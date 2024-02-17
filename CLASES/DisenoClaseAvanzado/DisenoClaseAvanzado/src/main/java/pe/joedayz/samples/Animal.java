package pe.joedayz.samples;

public abstract class Animal {
    abstract int getType();
}

abstract class Bird extends Animal implements Fly{
    abstract boolean canSwoop();
}

interface Fly {
    void fly();
}

interface Swim {
    void swim();
}

class Swan extends Bird implements Swim {

    @Override
    int getType() {
        return 0;
    }

    @Override
    boolean canSwoop() {
        return false;
    }

    @Override
    public void fly() {

    }

    @Override
    public void swim() {

    }
}
