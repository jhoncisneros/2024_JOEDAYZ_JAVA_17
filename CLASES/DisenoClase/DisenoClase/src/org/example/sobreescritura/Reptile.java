package org.example.sobreescritura;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

//Exception                 //Exception
//IOException               //SQLException
//FileNotFoundException

//RuntimeException
//IllegalArgumentException

public class Reptile {

    protected void sleep() throws IOException{}

    protected void hide(){}

    protected void exitShell() throws FileNotFoundException{}
}

class GalapagosTortoise extends Reptile{

//    protected void sleep() throws Exception {} //NO COMPILE
//    protected void sleep() throws SQLException {} //NO COMPILE

    protected void sleep() throws IOException,FileNotFoundException {}

//    protected void hide() throws FileNotFoundException{} //NO COMPILA

//    public void exitShell() throws IOException{} //NO COMPILA

    protected void hide() throws NullPointerException{} //SI COMPILA PORQUE ES RUNTIME, CUALQUIER RUNTIME

}
