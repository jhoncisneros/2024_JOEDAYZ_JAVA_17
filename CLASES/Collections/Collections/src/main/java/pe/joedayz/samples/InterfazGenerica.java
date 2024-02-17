package pe.joedayz.samples;

interface Shippable<T>{
    void ship(T t);
}

class ShippableRobotCrate implements Shippable<Robot>{

    @Override
    public void ship(Robot t) {}
}

class ShippableAbstractCrate<U> implements Shippable<U>{

    @Override
    public void ship(U t) {}
}

class ShippableCrate implements Shippable{

//    @Override
    public void ship(Object t) {}
}

public class InterfazGenerica {
}
