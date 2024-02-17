package org.example.clasesabstractas;

public abstract class Mammal {

    abstract void showHorn();
    abstract void eatLeaf();
}

abstract class Rhino extends Mammal{
    @Override
    void showHorn() {

    }
}

class BlackRhino extends Rhino{

    @Override
    void eatLeaf() {

    }
}
