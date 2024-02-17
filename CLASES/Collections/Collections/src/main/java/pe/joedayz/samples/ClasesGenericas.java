package pe.joedayz.samples;


import java.util.ArrayList;
import java.util.List;

class Elephant {}

class Zebra {}

class Robot {}

class LongTailAnimal {
    protected void chew(List<Object> input){}
//    protected void chew(List<Double> input){} //NO COMPILA
}

class Anteater extends LongTailAnimal {
//    protected void chew(List<Double> input){} //NO COMPILA
    protected void chew(List<Object> input){}
    protected void chew(ArrayList<Double> input){}
}

public class ClasesGenericas {

    public static void main(String[] args) {

        Elephant elephant = new Elephant();
        Crate<Elephant> crateForElephant = new Crate<>();
        crateForElephant.packCrate(elephant);
        Elephant inNewHome = crateForElephant.lookInCrate();

        Crate<Zebra> crateForZebra = new Crate<>();

        Robot joeBot = new Robot();
        Crate<Robot> robotCrate = new Crate<>();
        robotCrate.packCrate(joeBot);
        Robot atDestination = robotCrate.lookInCrate();

        Elephant elephant2 = new Elephant();
        Integer numPounds = 15_000;
        SizeLimitedCrate<Elephant, Integer> cl = new SizeLimitedCrate<>(elephant2, numPounds);

        Crate2 crate2 = new Crate2();
//        Robot r = crate2.lookInCrate2(); //NO COMPILA
        Robot r2 = (Robot) crate2.lookInCrate2();

        Robot r3 = new Robot();
        crate2.packCrate2(r3);
    }
}
