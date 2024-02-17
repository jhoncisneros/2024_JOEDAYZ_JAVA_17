package org.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Futures {

    public static void main(String[] args) {
        ExecutorService service = null;

        try{
            service = Executors.newSingleThreadExecutor();
            Future<?> futureHello = service.submit(()-> System.out.println("hello"));
            System.out.println(futureHello.isDone()); // false
            System.out.println(futureHello.isCancelled()); // false
        }finally {
            if(service != null)
                service.shutdown();
        }
    }

}
