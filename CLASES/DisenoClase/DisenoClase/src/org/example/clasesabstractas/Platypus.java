package org.example.clasesabstractas;

abstract class Mammal2 {

    abstract CharSequence chew();

    public Mammal2() {
        System.out.println(chew());
    }
}

public class Platypus extends Mammal2{

    @Override
    String chew() {
        return "yummy!";
    }

    public static void main(String[] args) {
        new Platypus();
    }
}
