package org.example.sobreescritura;

public class Beetlen {

    private String getSize(){
        return "undefined";
    }

}

class RhinocerosBeetlen extends Beetlen{

    private int getSize(){
        return 5;
    }

    public static void main(String[] args) {

    }
}
