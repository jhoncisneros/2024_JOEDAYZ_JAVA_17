package org.example;

import java.util.List;
import java.util.concurrent.*;

public class InvocandoAlgunasTares {

    public static void main(String[] args) throws InterruptedException {

        ExecutorService service = null;
        try{
            service = Executors.newSingleThreadExecutor();
            Callable<Integer> task = () -> (int) (30 + (10*Math.random() + 1));
            System.out.println("Begin");

            Integer data = service.invokeAny(List.of(task, task, task, task, task));
            System.out.println(data);
            System.out.println("End");
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
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
