package org.example;

import java.util.concurrent.*;

public class WaitAllTaskFinished {

    public static void main(String[] args) throws InterruptedException {
        //esperando que todas las tereas terminen

        ExecutorService service = null;
        try{
            service = Executors.newSingleThreadExecutor();

            service.submit( () -> 30 + 11);
            service.submit( () -> 30 + 11);
            service.submit( () -> 30 + 11);
            service.submit( () -> 30 + 11);

        }finally {
            if(service != null)
                service.shutdown();
        }

        service.awaitTermination(1, TimeUnit.MINUTES); //esperamos 1 minuto a que terminen las tareas y nos den resultados

        if(service.isTerminated()){
            System.out.println("finished");
        }else{
            System.out.println("al menos una tarea aun se está ejecutando");
        }

    }
}
