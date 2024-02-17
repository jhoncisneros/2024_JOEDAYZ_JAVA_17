package org.example;

public class Mammal {

    public Mammal(int age){}
}

class Seal extends Mammal{

    public Seal() {
        super(6);
    }

    public Seal(int age) {
        super(age);
    }
}

class AfricanElephan extends Seal{

}
