package org.example;

public class Animal3 {

    private int age;
    private String name;

    public Animal3(int age, String name) {
        super();
        this.age = age;
        this.name = name;
    }

    public Animal3(int age) {
        super();
        this.age = age;
        this.name = null;
    }
}

class Gorilla extends Animal3{

    public Gorilla(){
        super(5);
    }

    public Gorilla(int age){
        super(age, "Gorilla");
    }

}
