package pe.joedayz.samples;

import java.util.ArrayList;
import java.util.List;

class Mammal {
    public List<CharSequence> play(){ return null; }
    public CharSequence sleep(){ return null; }
}

class Monkey extends Mammal{
    public ArrayList<CharSequence> play(){ return null; }
}

class Goat extends Mammal{
//    public List<String> play(){ return null; } //NO COMPILA
    public String sleep(){ return null; }
}

public class RetornandoGenerico {
}
