package pe.joedayz.samples.seal;

public abstract sealed class Wolf permits Timber{

}

final class Timber extends Wolf{

}

//final class MyWolf extends Wolf{} //NO COMPILA