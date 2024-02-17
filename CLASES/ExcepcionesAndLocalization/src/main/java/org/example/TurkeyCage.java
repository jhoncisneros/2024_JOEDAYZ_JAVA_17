package org.example;

public class TurkeyCage implements AutoCloseable{

    @Override
    public void close() throws Exception {
        System.out.println("close gate");
    }

    public static void main(String[] args) throws Exception {

        //Excepciones suprimidas
        try(var t = new TurkeyCage()){
            System.out.println("put turkeys in");
        }

    }

}
