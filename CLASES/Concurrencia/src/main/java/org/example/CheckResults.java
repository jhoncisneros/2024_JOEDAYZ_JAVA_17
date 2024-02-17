package org.example;

public class CheckResults {

    private static int counter = 0;

    public static void main(String[] args) {
        //POOLING CON SLEEP

        new Thread( () -> {
            for (int i =0; i<1_000_000; i++)
                counter++;
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
