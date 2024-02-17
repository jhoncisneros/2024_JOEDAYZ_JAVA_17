package pe.joedayz.samples.seal;

public sealed interface Swims permits Duck, Swam, Floats{

}

final class Duck implements Swims{

}

final class Swam implements Swims{

}

non-sealed interface Floats extends Swims {

}
