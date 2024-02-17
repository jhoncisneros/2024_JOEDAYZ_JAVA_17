package org.example;

import java.util.concurrent.*;

public class CheckResultsWithExecutorService {

    private static int counter = 0;

    public static void main(String[] args) {
        ExecutorService service =  Executors.newSingleThreadExecutor();

        try {
            Future<?> result = service.submit( () -> {
               for (int i =0; i<3; i++){
                   counter++;
               }
            });
            result.get(10, TimeUnit.SECONDS);
            System.out.println("Reached");
        }catch (ExecutionException | InterruptedException | TimeoutException e){
            System.out.println("No lo consegui en el tiempo dado");
        }finally {
            service.shutdown();
        }
    }
}
