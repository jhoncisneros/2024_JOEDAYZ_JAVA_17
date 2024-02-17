package org.example.clasesabstractas;

public abstract class Persona {

//    public static void main(String[] args) {
//        new Persona(); //NO COMPILA
//    }

    public void play(){}

    public abstract CharSequence run();
}

abstract class PersonaNatural extends Persona{

}

class LuisPerez extends PersonaNatural{

    @Override
    public String run() {
        return "Soy String";
    }

    public static void main(String[] args) {
        new LuisPerez().play();
        new LuisPerez().run();
    }
}
