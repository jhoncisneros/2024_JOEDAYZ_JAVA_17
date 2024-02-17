package no.acme.samples;

import java.io.IOException;

public class ZooMonorail {

    public void zeroExceptions(){}

    public void oneException() throws IllegalArgumentException {}

    public void roar(){
        oneException();
    }

    public void twoExeptions() throws IllegalArgumentException, InterruptedException {}



    public void unException() throws IOException{}

    public void play(){ //atrapar el exception
        try {
            unException();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void play2() throws IOException { //ducking exception //patear el exception
        unException();
    }
}
