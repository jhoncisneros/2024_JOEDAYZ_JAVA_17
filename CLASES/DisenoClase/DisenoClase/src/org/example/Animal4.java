package org.example;

public class Animal4 {

    static {
        System.out.println("A");
    }
}

class Hippo extends Animal4{

    public static void main(String[] args) {
        System.out.println("C");
        new Hippo();
        new Hippo();
        new Hippo();
    }

    static {
        System.out.println("B");
    }
}
