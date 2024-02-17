package org.example.clasesabstractas;

public abstract class Animal {

    abstract String getName();
}

abstract class BigCat extends Animal{
    protected abstract void roar();
}

class Lion extends BigCat{

    @Override
    String getName() {
        return "Lion";
    }

    @Override
    public void roar() {
        System.out.println("The Lion lets out a loud ROAR!");
    }
}
