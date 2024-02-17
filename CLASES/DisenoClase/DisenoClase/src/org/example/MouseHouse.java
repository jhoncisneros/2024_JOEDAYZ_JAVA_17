package org.example;

public class MouseHouse {

    private final int volume;

//    private final String name = "The mouse house";
//
//    {
//        volume = 10;
//    }
    private final String name;

//    public MouseHouse(){
//        this.name = "The mouse house";
//    }
//
//    {
//        volume = 10;
//    }

    {
        volume = 10;
        System.out.println("A");
    }

//    public MouseHouse(String name){
//        System.out.println("C");
//        this.name = name;
//    }

    public MouseHouse(){
//        this(null);
        System.out.println("C");
        this.name = "Empty House";
    }

    public static void main(String[] args) {
        System.out.println("D");
        new MouseHouse();
//        new MouseHouse();
    }

    {
        System.out.println("B");
    }
}
