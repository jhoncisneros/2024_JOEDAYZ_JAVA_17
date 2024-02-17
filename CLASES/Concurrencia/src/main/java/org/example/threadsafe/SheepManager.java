package org.example.threadsafe;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SheepManager {

//    private int sheepCount = 0;
    private volatile int sheepCount = 0;

    private void incrementAndReport(){
        System.out.println((++sheepCount) + " ");
    }

    public static void main(String[] args) {

        ExecutorService service = Executors.newFixedThreadPool(20);
        try{
            SheepManager manager = new SheepManager();
            for (int i=0; i < 10; i++){
                service.submit(()->manager.incrementAndReport());
            }
        }finally {
            service.shutdown();
        }
    }
}
