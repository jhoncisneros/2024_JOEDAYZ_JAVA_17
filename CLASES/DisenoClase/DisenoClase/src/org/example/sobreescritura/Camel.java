package org.example.sobreescritura;


//public
//protected
//package private
//private

public class Camel {

    public int getNumberOfHumps(){
        return 1;
    }
}

class BactrianCamel extends Camel{

     public int getNumberOfHumps(){
        return 2;
    }
}