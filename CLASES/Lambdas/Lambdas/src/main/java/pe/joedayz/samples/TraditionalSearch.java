package pe.joedayz.samples;

import java.util.ArrayList;
import java.util.List;

record Animal(String species, boolean caHop, boolean canSwin){}

@FunctionalInterface
interface CheckTrait {
    boolean test(Animal A);
}

class CheckIfHopper implements CheckTrait {

    @Override
    public boolean test(Animal a) {
        return a.caHop();
    }
}

public class TraditionalSearch {

    public static void main(String[] args) {
        var animals = new ArrayList<Animal>();
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("kangaroo", true, false));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("turtle", false, true));

//        print(animals, new CheckIfHopper());
        print(animals, a -> a.caHop());
        print(animals, (Animal a) -> {return a.canSwin();});
        print(animals, (Animal a) -> !a.canSwin());
//        var invalid = (Animal a) -> a.caHop(); //ERROR
    }

    private static void print(List<Animal> animals, CheckTrait checker){
        for (Animal animal : animals){
            if(checker.test(animal))
                System.out.println(animal + " ");
        }
        System.out.println();
    }
}
