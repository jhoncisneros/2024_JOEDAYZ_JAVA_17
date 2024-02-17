package pe.joedayz.samples;

import java.util.ArrayList;
import java.util.List;

class Handler {
    public static <T> void prepare(T t){
        System.out.println("Preparing " + t);
    }

    public static <T, U> void prepare2(T t, U u){
        System.out.println("Preparing " + t);
    }

    public static <T> Crate<T> ship(T t){
        System.out.println("Shipping " + t);
        return new Crate<T>();
    }
}

class More{
    public static <T> void sink(T t){

    }

    public static <T> T identity(T t){
        return t;
    }

//    public static T noGood(T t){ return t;} //NO COMPILA
}

class TrickyCrate<T> {

    public <T> T tricky(T t){
        return t;
    }
}

record CrateRecord<T>(T contents){

    @Override
    public T contents(){
        if(contents == null)
            throw new IllegalArgumentException("missing contents");
        return contents;
    }
}

public class MetodosGenericos {

    public static String createName(){
        TrickyCrate<Robot> crate = new TrickyCrate<>();
        return crate.tricky("bot");
    }

    public static void main(String[] args) {
        More.<String>sink("package");
        More.<String[]>sink(args);

        TrickyCrate<Robot> crate = new TrickyCrate<>();
        System.out.println(MetodosGenericos.createName());
        System.out.println(crate.tricky(1));

        Robot robot = new Robot();
        CrateRecord<Robot> record = new CrateRecord<>(robot);

        List<CrateRecord<Robot>> rabbits = new ArrayList<>();
        rabbits.add(record);
        System.out.println(rabbits);
    }
}
