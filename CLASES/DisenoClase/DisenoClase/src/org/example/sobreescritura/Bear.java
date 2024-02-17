package org.example.sobreescritura;

public class Bear {

    public static void sneeze(){
        System.out.println("Bear is sneezing");
    }

    public void hibernate(){
        System.out.println("Bear is hibernatinhg");
    }

    public static void laugh(){
        System.out.println("Bear is laughing");
    }
}

class SunBear extends Bear{

//    public void sneeze(){ //NO COMPILA PORQUE NO ES STATIC
//        System.out.println("Bear is sneezing");
//    }

//    public static void hibernate(){ //NO COMPILA POR REGLA STATIC
//        System.out.println("Bear is hibernatinhg");
//    }

//    protected static void laugh(){ //NO COMPILA POR REGLA DE STATIC
//        System.out.println("Bear is laughing");
//    }

}
