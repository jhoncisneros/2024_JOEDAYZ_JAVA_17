package org.example;

import java.util.concurrent.*;

public class ScheduledExecutorSamples {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //programando task
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();

        Callable<String> task = () -> "Peru";

        // la primera tarea se programa para 10 seg en el futuro
//        ScheduledFuture<String> schedule1 = service.schedule(task, 10, TimeUnit.SECONDS);

        // la segunda tarea es programada para 8 min en el futuro
//        ScheduledFuture<String> schedule2 = service.schedule(task, 8, TimeUnit.MINUTES);

//        System.out.println(schedule1.get());

//        System.out.println(schedule2.get());

//        ScheduledFuture<String> schedule1 =(ScheduledFuture<String>) service.scheduleAtFixedRate(() -> System.out.println("Peru"), 1,2,TimeUnit.MINUTES);

//        System.out.println(schedule1.get());

        ScheduledFuture<String> schedule1 =(ScheduledFuture<String>) service.scheduleWithFixedDelay(() -> System.out.println("Peru"), 1,2,TimeUnit.MINUTES);

        System.out.println(schedule1.get());

    }
}
