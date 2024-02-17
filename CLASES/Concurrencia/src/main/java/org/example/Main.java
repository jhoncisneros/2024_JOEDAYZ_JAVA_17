package org.example;

public class Main {

    public static void main(String[] args) {

        //CREANDO HILOS
        Runnable printInventory = () -> System.out.println("Printing zoo inventory");

        Runnable printRecords = () -> {
          for (int i = 0; i < 3; i++){
              System.out.println("Printing record: " + i);
          }
        };

        System.out.println("begin");

        //HABRE VARIOS HILOS LO CUAL CUALQUIERA PUEDE TERMINARN PRIMERO, ES IMPREDESIBLE
        new Thread(printInventory).start();
        new Thread(printRecords).start();
        new Thread(printInventory).start();

        //NO INICIA HILO, LO HACE SECUENCIAL EN UN SOLO HILO
//        new Thread(printInventory).run();
//        new Thread(printRecords).run();
//        new Thread(printInventory).run();

        System.out.println("end");

    }

}
