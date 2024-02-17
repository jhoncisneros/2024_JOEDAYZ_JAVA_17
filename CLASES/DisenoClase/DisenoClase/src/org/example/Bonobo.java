package org.example;

public class Bonobo {

//    public Bonobo(var food){} //NO SE PUEDE USAR VAR EN PARAMETROS DE CONTRUCTOR

    public Bonobo(String food){
        //super(); //ESTO LO AGREGA EL COMPILADOR
    }

    public static void main(String[] args) {
//        var bonobo = new Bonobo(); //NO COMPILA NO HAY CONSTRUCTOR SINA RGUMENTOS
        var bonobo = new Bonobo("hola");

    }

}
