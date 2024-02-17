package org.example;

public class CanNotHopException extends Exception{

}

class Hopper {

    public void hop() throws CanNotHopException{
    }

}

class Bunny2 extends Hopper {

//    public void hop() throws CanNotHopException { // NO COMPILA
//    }

    public void hop(){

    }
}
