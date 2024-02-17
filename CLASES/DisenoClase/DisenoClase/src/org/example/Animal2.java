package org.example;

public class Animal2 {

    private int age;

    public Animal2(int age){
        super(); //SIEMPRE VA EN LA PRIMERA LINEA , LLAMA AL CONSTRUCTOR DEL OBJECT
        this.age = age;
    }
}

class Zebra extends Animal2{

    public Zebra(int age){
        super(age);
    }

    public Zebra(){
//        System.out.println("hola"); //NO COMMPILA
        this(4);
    }
}
