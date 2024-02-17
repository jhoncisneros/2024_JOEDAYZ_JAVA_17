package org.example.clasesabstractas;

public abstract class Canine {

    public abstract String getSound();

    public void bark(){
        System.out.println(getSound());
    }

    public static void main(String[] args) {
        Canine w = new Wolf();
        w.bark();
//        w.play(); //NO COMPILA
//        w.getSound();

        Canine d = new Dog();
        d.bark();
    }
}

class Wolf extends Canine{

    @Override
    public String getSound() {
        return "Woooooooo";
    }

    public void play(){}
}

class Fox extends Canine{

    @Override
    public String getSound() {
        return "Squeakkkkk";
    }
}

class Dog extends Canine{

    @Override
    public String getSound() {
        return "Guau guau";
    }
}

//class FennecFox extends Canine{

//    @Override
//    public int getSound() { //NO COMPILA
//        return 10;
//    }
//}

//class ArcticFox extends Canine{ // NO COMPILA
//
//}

class Jackal extends Canine{

//    public abstract String name; //NO COMPILA

    @Override
    public String getSound() {
        return null;
    }
}