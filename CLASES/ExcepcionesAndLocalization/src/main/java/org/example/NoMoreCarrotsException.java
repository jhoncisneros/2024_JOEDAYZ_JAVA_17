package org.example;

public class NoMoreCarrotsException extends Exception{

}

class Bunny {

    public static void main(String[] args) throws NoMoreCarrotsException {
//        eatCarrot(); //NO COMPILA
        eatCarrot();
    }

    private static void eatCarrot() throws NoMoreCarrotsException {

    }

}

class MsBunny {

    public static void main(String[] args) {
//        eatCarrot();

//        try {
//            eatCarrot();
//        }catch (NoMoreCarrotsException e){ // NO COMPILA
//            e.printStackTrace();
//        }
    }

    private static void eatCarrot() {

    }
}