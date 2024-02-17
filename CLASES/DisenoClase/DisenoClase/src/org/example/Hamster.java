package org.example;

public class Hamster {

    private String color;
    private int weight;

    public Hamster(int weight, String color) {
        this.color = color;
        this.weight = weight;
    }

    public Hamster(int weight) {
//        Hamster(weight, "brown"); //NO COMPILA
//        new Hamster(weight, "brown"); //CREA UNA INSTANCIA
//        System.out.println("chew"); //NO COMPILA
        this(weight, "brown"); //SIEMPRE TIENE QUE ESTAR EN LA PRIMERA LINEA
        System.out.println("chew");
    }
}
