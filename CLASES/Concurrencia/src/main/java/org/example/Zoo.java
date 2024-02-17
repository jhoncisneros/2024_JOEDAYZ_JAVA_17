package org.example;

public class Zoo {

    public static void pause(){
        try{
            Thread.sleep(10_000);
        }catch (InterruptedException e){}
        System.out.println("Thread finished!!");
    }

    public static void main(String[] args) {
        //TIPOS DE HILOS
        var job = new Thread( () -> pause() );

//        job.setDaemon(true); //El programa termina sin esperar a que termine de ejecutar el hilo
        job.start(); // inicia el hilo

        System.out.println("main method finished!!");

    }

}
