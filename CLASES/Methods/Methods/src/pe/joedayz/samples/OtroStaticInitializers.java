package pe.joedayz.samples;

public class OtroStaticInitializers {

//    private final int one1;
    private static int one;

    private static final int two;

    private static final int three = 3;

    static {
        one = 1;
        two = 2;
//        three = 3; //NO COMPILA
//        two = 4;//NO COMPILA
    }

//    {
//        one1 = 1;
//    }
}
