package org.example.threadsafe;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LionPenManager {

    private void removeLions(){
        System.out.println("Removing lions");
    }

    private void cleanPean(){
        System.out.println("Clean the pen");
    }

    private void addLions(){
        System.out.println("Adding lions");
    }

    public void performTask(CyclicBarrier c1, CyclicBarrier c2){

        try {
            removeLions();
            c1.await();
            cleanPean();
            c2.await();
            addLions();
        } catch (InterruptedException | BrokenBarrierException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        ExecutorService service = null;
        try{
            service = Executors.newFixedThreadPool(4);
            var manager = new LionPenManager();
            var c1 = new CyclicBarrier(4);
            var c2 = new CyclicBarrier(4);
            for(int i=0;i<4;i++){
                service.submit( ()-> manager.performTask(c1, c2) );
            }
        }finally {
            if(service != null){
                service.shutdown();
            }
        }
    }
}
