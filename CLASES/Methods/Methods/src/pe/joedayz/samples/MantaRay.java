package pe.joedayz.samples;

public class MantaRay {

    private String name = "Sammy";

    public static void first(){
//        System.out.println(name); //NO COMPILA
    }

    public static void second(){}

    public void third(){
        System.out.println(name);
    }

    public static void main(String[] args) {
        first();
        second();
//        third(); //NO COMPILA
    }
}
