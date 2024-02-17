package pe.joedayz.samples;

public class Giraffe {

    public void eat(Giraffe g){
        allGiraffeComeOut();
        allGiraffeGoHome(new Giraffe());
        drink();
        g.eat(new Giraffe());
    }

    public void drink(){}

    public static void allGiraffeGoHome(Giraffe g){

        allGiraffeComeOut();
//        drink(); //NO COMPILA
        g.eat(new Giraffe());
    }

    public static void allGiraffeComeOut(){}

}
