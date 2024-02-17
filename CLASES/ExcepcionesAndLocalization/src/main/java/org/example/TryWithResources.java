package org.example;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class TryWithResources {

    public static void main(String[] args) {
        TryWithResources tryWithResources = new TryWithResources();

//        tryWithResources.readFile("myfile.txt");

        System.out.println("**************");

//        tryWithResources.readFile2("myfile.txt");

        System.out.println("**************");

//        tryWithResources.readFile3("myfile.txt");

        System.out.println("**************");

//        tryWithResources.readFile4("myfile.txt");

        System.out.println("**************");

        //NO COMPILA
//        try(Scanner s = new Scanner(System.in)){
//            s.nextLine();
//        }catch (Exception e){
//            s.nextInt(); //NO COMPILA
//        }finally {
//            s.nextInt(); //NO COMPILA
//        }

        //IMPRIME
        /*
        try block
        Closing...2
        Closing...1
        catch block
        finally block
        */
        try(MyAutoCloseable bookReader = new MyAutoCloseable(1);
            MyAutoCloseable movieReader = new MyAutoCloseable(2)){

            System.out.println("try block");
            throw new RuntimeException();
        }catch (Exception e){
            System.out.println("catch block");
        }finally {
            System.out.println("finally block");
        }



    }

    //ANTES DE JAVA 7 - imprime 0, 2 y error
    public void readFile(String file){
        FileInputStream is = null;
        try {
            System.out.println("0");
//            is = new FileInputStream("C:\\Documentos\\CARTA_COMPROMISO.pdf");
            is = new FileInputStream("myfile.txt");
            System.out.println("1");
            //read file data
        }catch (IOException e){
            System.out.println("2");
            e.printStackTrace();
        } finally {
            if( is != null){
                try {
                    System.out.println("3");
                    is.close();
                }catch (IOException e2){
                    System.out.println("4");
                    e2.printStackTrace();
                }
            }
        }
    }

    //DESDE JAVA 7 - imprime 3 y error
    public void readFile2(String file){
        //AQUI VA ALGO QUE IMPLEMENTA Closeable
        try (FileInputStream is = new FileInputStream("myfile.txt")){
            System.out.println("1");
            //rad file data
        }catch (IOException e){
            System.out.println("3");
            e.printStackTrace();
        }

    }

    // en el try puede ir varios parametros closeable - imprime 2 y 3
    // SE CIERRA EN ORDEN INVERSO, OUT PRIMERO IN ULTIMO
    public void readFile3(String file){

        try(var in = new FileInputStream("data.txt");
            var out = new FileOutputStream("output.txt");){
            System.out.println("1");
        }catch (IOException e){
            System.out.println("2");
        } finally {
            System.out.println("3");
        }

    }

    //PRIMERO SE CIERRA OS LUEGO IS
    public void readFile4(String file){

        try(var is = new MyAutoCloseable(1);
            var os = new MyAutoCloseable(2)){
            System.out.println("autoclseable");
        } catch (Exception e) {
            System.out.println("error autoclseable");
            throw new RuntimeException(e);
        }


    }
}
