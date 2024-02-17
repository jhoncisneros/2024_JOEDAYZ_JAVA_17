package pe.joedayz.samples.seal;

public sealed class Mammal permits Equine {

}

sealed class Equine extends Mammal permits Zebra{

}

final class Zebra extends Equine{

}

