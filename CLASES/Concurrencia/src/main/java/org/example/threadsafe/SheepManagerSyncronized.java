package org.example.threadsafe;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SheepManagerSyncronized {

    private int sheepCount = 0;

    private final Object herd = new Object();

    private void incrementAndReport(){
        synchronized (herd) {
//        synchronized (this) {
            System.out.println((++sheepCount) + " ");
        }
    }

    public static void main(String[] args) {

        ExecutorService service = Executors.newFixedThreadPool(20);
        try{
            SheepManagerSyncronized manager = new SheepManagerSyncronized();
            for (int i=0; i < 10; i++){
                service.submit(()->manager.incrementAndReport());
            }
        }finally {
            service.shutdown();
        }
    }

}
