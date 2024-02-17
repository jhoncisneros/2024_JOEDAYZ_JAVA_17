package org.example;

import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class OtroTryWithResources {

    public static void main(String[] args) throws Exception {

        //IMPRIME
        /*
            try block
            Closing...5
            Closing...6
            Closing...4
            finally block
        */
        final var bookReader = new MyAutoCloseable(4); //variable final
        MyAutoCloseable movieReader = new MyAutoCloseable(5); //variable efectivamente final

        try(bookReader;
            var tvReader = new MyAutoCloseable(6);
            movieReader){

            System.out.println("try block");
        }finally {
            System.out.println("finally block");
        }

        System.out.println("*********************");

        //NO COMPILA POR SER EFECTIVAMENTE FINAL
//        Path path = Path.of(URI.create("myfile.txt"));
//
//        var writer = Files.newBufferedWriter(path);
//        try(writer){ // NO COMPILA AQUI
//            writer.append("welcome");
//        }
//
//        writer = null;

        System.out.println("*********************");

        Path path = Paths.get("C:\\Configuration\\prueba.txt");

        var writer = Files.newBufferedWriter(path);
        writer.append("ideal");
        try(writer){
            writer.append("welcome");
        }
        writer.append("fail"); //ERROR EN TIEMPO DE EJECUCION PORQUE YA SE CERRÓ

    }
}
