package org.example;

public class Frog {

    private int numberEggs;
    public void hop(String name, Integer jump){
        System.out.println(name.toLowerCase() + " " + jump.intValue());
    }

    public void setNumberEggs(int numberEggs){

        if(numberEggs < 0)
            throw new IllegalArgumentException("# eggs must not be negative");

        this.numberEggs = numberEggs;
    }

    public static void main(String[] args) {

//        new Frog().hop(null, 1); //NullPointerException

//        new Frog().hop("Kermit", null); //NullPointerException

//        new Frog().setNumberEggs(-1); //IllegalArgumentException

//        Integer.parseInt("abc"); //NumberFormatException

    }

}
