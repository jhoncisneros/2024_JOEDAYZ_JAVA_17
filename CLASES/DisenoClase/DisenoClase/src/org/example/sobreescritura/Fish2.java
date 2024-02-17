package org.example.sobreescritura;

public class Fish2 {

    public void swim(){

    }

    @Override
    public String toString(){
        return super.toString();
    }
}

class Shark extends Fish2{

//    @Override //NO COPMPILA, NO HAY SOBREESCRITURA, HAY SOBRERCARGA
    public void swim(int speed){}

}