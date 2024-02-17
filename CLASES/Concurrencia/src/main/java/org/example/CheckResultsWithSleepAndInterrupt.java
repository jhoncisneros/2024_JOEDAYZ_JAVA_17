package org.example;

public class CheckResultsWithSleepAndInterrupt {

    private static int counter = 0;

    public static void main(String[] args) {
        //INTERRUMPIENDO UN HILO

        final var mainThread = Thread.currentThread();

        new Thread( () -> {
            for (int i =0; i<1_000_000; i++)
                counter++;
            mainThread.interrupt();
        }).start();

        while(counter<1_000_000){
            System.out.println("Not reached yet");
            try{
                Thread.sleep(1_000);
            }catch (InterruptedException ex){
                System.out.println("Interruped!!");
            }
        }

        System.out.println("Reached: " + counter);

    }

}
