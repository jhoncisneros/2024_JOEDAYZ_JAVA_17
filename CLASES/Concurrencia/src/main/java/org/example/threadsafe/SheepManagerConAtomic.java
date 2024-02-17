package org.example.threadsafe;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class SheepManagerConAtomic {

    //    private int sheepCount = 0;
    private AtomicInteger sheepCount = new AtomicInteger(0);

    private void incrementAndReport(){
        System.out.println(sheepCount.incrementAndGet() + " ");
    }

    public static void main(String[] args) {

        ExecutorService service = Executors.newFixedThreadPool(20);
        try{
            SheepManagerConAtomic manager = new SheepManagerConAtomic();
            for (int i=0; i < 10; i++){
                service.submit(()->manager.incrementAndReport());
            }
        }finally {
            service.shutdown();
        }
    }
}
