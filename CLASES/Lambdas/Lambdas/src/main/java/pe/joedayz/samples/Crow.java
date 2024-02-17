package pe.joedayz.samples;

import java.util.function.Consumer;

public class Crow {

    private String color;

    public void caw(String name){
        String volume = "loudly";
        Consumer<String> consumer = s -> System.out.println(name + " says " + volume + " that she is " + color);
    }
}

class Crow2 {

    private String color2;

    public void caw2(String name2){

        String volume2 = "loudly";
        name2 = "Caty";
        color2 = "black";

//        Consumer<String> consumer = s -> System.out.println(name2 + " says " + volume2 + " that she is " + color2); //NO COMPILA

        volume2 = "softly";
    }
}
