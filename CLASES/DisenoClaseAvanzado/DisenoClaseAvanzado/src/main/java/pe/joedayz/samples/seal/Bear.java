package pe.joedayz.samples.seal;

public sealed class Bear permits Kodiak, Panda {
}

final class Kodiak extends Bear{

}

non-sealed class Panda extends Bear{

}

class Osito extends Panda{

}

class KungfuPanda extends Panda{

}
