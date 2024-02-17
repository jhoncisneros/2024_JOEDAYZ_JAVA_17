package org.example;

public class JammedTurkeyCage implements AutoCloseable{

    @Override
    public void close() throws IllegalStateException {
        throw new IllegalStateException("cage door does not close");
    }

    public static void main(String[] args) {

        //SUPRIMIENDO EXCEPCIONES
        try(var t = new JammedTurkeyCage()){
//            System.out.println("jummper");
            throw new IllegalStateException("turkeys ran off");
        }catch (IllegalStateException e){
            System.out.println("Caugth: " + e.getMessage());

            for(Throwable t: e.getSuppressed()){
                System.out.println("Suppressed: " + t.getMessage()); //IMPRIME: Suppressed: cage door does not close
            }
        }

        System.out.println("****************");

        // al ejecutar se CAE por que nadie atrapa el RuntimeException
//        try(JammedTurkeyCage t = new JammedTurkeyCage()){
//            throw new RuntimeException("turkeys ran off");
//        }catch (IllegalStateException e){
//            System.out.println("caugth: " + e.getMessage());
//        }

        System.out.println("****************");

        //error al ejecutar por el RuntimeException, nadie lo atrapa
        try(JammedTurkeyCage t = new JammedTurkeyCage()){
            throw new IllegalStateException("turkeys ran off");
        }finally {
            throw new RuntimeException("and we clouid fin them");
        }

    }

    /*
    primero imprime:

    jummper
    Caugth: cage door does not close

    segundo imprime:

    Caugth: turkeys ran off

    * */
}
