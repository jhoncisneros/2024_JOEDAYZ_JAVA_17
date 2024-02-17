package pe.joedayz.samples.seal;

public sealed class Snake permits Cobra{

}

final class Cobra extends Snake{

}




sealed class Snake2{

}

final class Cobra2 extends Snake2{

}

non-sealed class Piton extends Snake2{

}




sealed class Snake3 {
    final class Cobra3 extends Snake3{

    }

    non-sealed class Piton2 extends Snake3{

    }
}



sealed class Snake4 permits Cobra4, Snake4.Cobra4, Snake4.Piton4 {
    final class Cobra4 extends Snake4{

    }

    non-sealed class Piton4 extends Snake4{

    }
}

final class Cobra4 extends Snake4{

}