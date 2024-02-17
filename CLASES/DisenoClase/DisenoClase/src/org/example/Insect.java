package org.example;

public class Insect {

    protected int numberOfLegs = 4;
    String label = "buggy";

}

class Beetle extends Insect{

    protected int numberOfLegs = 6;
    short age = 3;

    public void printData(){
        System.out.println(label);
        System.out.println(this.label);
        System.out.println(super.label);
        System.out.println(this.age);
//        System.out.println(super.age); //NO COMPILA
        System.out.println(numberOfLegs);
        System.out.println(this.numberOfLegs);
        System.out.println(super.numberOfLegs);
    }

    public static void main(String[] args) {
        new Beetle().printData();
    }
}
