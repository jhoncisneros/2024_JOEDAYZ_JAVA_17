package org.example.sobreescritura;

//CharSequence
//String

public class Rhino {

    protected CharSequence getName(){
        return "Rhino";
    }

    protected String getColor(){
        return "grey, black or white";
    }
}

class JavaRhino extends Rhino{

    protected String getName(){
//        super.getName();
        return "JavaRhino";
    }

//    protected CharSequence getColor(){ //NO COMPILA
//        return "Java grey, black or white";
//    }

    public static void main(String[] args) {

    }
}