package pe.joedayz.samples;

import java.util.List;
import java.util.function.*;

class Panda {

    int age;

    public static void main(String[] args) {
        Panda p1 = new Panda();
        p1.age = 1;

        check(p1, p -> p.age < 5);
    }

    private static void check(Panda panda, Predicate<Panda> pred){
        String result = pred.test(panda) ? "match" : "not match";
        System.out.println(result);
    }
}

interface Climb {
    boolean isTooHigh(int height, int limit);
}

class Climber {

    public static void main(String[] args) {

//        check((h, m) -> h.append(m).isEmpty(), 5);//NO COMPILA
    }

    private static void check(Climb climb, int height){
        if(climb.isTooHigh(height, 10))
            System.out.println("too high");
        else
            System.out.println("ok");
    }
}

interface Secret {
    String magic(double d);
}

class MySecret implements Secret {

    @Override
    public String magic(double d) {
        return "Poof";
    }
}

class Fantasy {
    public static void scary(String animal){
//        var dino = s -> "dino".equals(animal); //NO COMPILA
//        var dragon = s -> "dragon".equals(animal); //NO COMPILA

    }

}

class Hyena {
    private int age = 1;

    public static void main(String[] args) {
        var p = new Hyena();
        double height = 10;
        int age = 1;
        testLaugh(p, var -> p.age <= 10);
//        testLaugh(p, shenzi -> age == 1); //NO COMPILA
//        testLaugh(p, p -> true); //NO COMPILA
//        testLaugh(p, age == 1); //NO COMPILA
//        testLaugh(shenzi -> age == 2); //NO COMPILA
        testLaugh(p, h -> h.age < 5);
        age = 2;
    }

    static void testLaugh(Hyena panda, Predicate<Hyena> joke){
        var r = joke.test(panda) ? "hahaha" : "silence";
        System.out.println(r);
    }
}


public class Revision {

    public void remove(List<Character> chars){
        char end = 'z';
        Predicate<Character> predicate = c -> {
            char start = 'a';
            return start <= c && c <= end;
        };

        char start = 'a';
        char c = 'x';
        chars = null;
//        end = '1'; //EFECTIVAMENTE FINAL NO COMPILA
    }

    public void method(){
        x((var x) -> {}, (var x, var y) -> false);
    }

    public void x (Consumer<String> x, BinaryOperator<Boolean> y){

    }

    public static void main(String[] args) {
//        var mysecret = new MySecret();
//        System.out.println(mysecret.magic(2.0));

        Function<Integer, Integer> s = a -> a + 4;
        Function<Integer, Integer> t = a -> a * 3;
        Function<Integer, Integer> c = s.compose(t);

        System.out.println(c.apply(1));

        int length = 3;

        for (int i = 0; i < 3; i++) {
            if(i%2 == 0){
                Supplier<Integer> supplier = () -> length;
                System.out.println(supplier.get());
            }else{
                int j = i;
                Supplier<Integer> supplier = () -> j;
                System.out.println(supplier.get());
            }
        }

    }
}
