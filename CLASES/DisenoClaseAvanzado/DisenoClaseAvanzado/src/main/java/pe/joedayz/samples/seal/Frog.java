package pe.joedayz.samples.seal;

//public class sealed Frog permits GlassFrog {} //NO COMPILA

public sealed class Frog permits GlassFrog {

}

final class GlassFrog extends Frog{

}

