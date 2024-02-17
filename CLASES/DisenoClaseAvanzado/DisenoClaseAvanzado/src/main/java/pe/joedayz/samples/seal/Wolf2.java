package pe.joedayz.samples.seal;

public sealed class Wolf2 permits Timber2{

}

non-sealed class Timber2 extends Wolf2 {

}

class MyWolf2 extends Timber2{

}
