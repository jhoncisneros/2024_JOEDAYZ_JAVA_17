package org.example;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    void fail(int distance) throws IOException{
        if(distance > 10){
            throw new IOException();
        }
    }

    void fail(String input){
        System.out.println(input.toLowerCase());
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello World");

//        throw new Exception();
//        throw new Exception("Fail");
//        throw new RuntimeException();
//        throw new RuntimeException("Fail Run");

//        var e = new RuntimeException("fail");
//        throw e;

//        throw RuntimeException(); // NO COMPILA

//        String[] animals = new String[0];
//        System.out.println(animals[0]); // ArrayIndexOutOfBoundsException

//        int answer = 11 / 0; // .ArithmeticException

//        int[] countsOfMoose = new int[3];
//        System.out.println(countsOfMoose[-1]); //ArrayIndexOutOfBoundsException

//        String type = "moose";
//        Object obj = type;
//        Integer number = (Integer) obj; //ClassCastException



//        try {
//            hop();
//        }catch (Exception e){
//            System.out.println(e + "\n");
//            System.out.println(e.getMessage() + "\n");
//            e.printStackTrace();
//        }

//        try {
//            pong();
//        }catch (IOException e) {
//            System.out.println("entro por ioexception");
//        }catch (ArithmeticException | IllegalArgumentException e){
//            System.out.println("entro por ArithmeticException");
//            //codigo comun
//        }finally {
//            System.out.println("entro al finallyu");
//        }

//        new Main().explore();

        // aplicando bloques multi-cathc

        try {
            System.out.println(Integer.parseInt(args[1]));
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Missing or invalid input");
        }catch (NumberFormatException e){
            System.out.println("Missing or invalid input 2");
        }

        try {
            System.out.println(Integer.parseInt(args[1]));
        }catch (ArrayIndexOutOfBoundsException | NumberFormatException e){
            System.out.println("Missing or invalid input 3");
        }

//        try {
//            System.out.println(Integer.parseInt(args[1]));
//        }catch (Exception1 e | Exception2 e | Exception3 e){ //NO COMPILA
//        }catch (Exception1 e1 | Exception2 e2 | Exception3 e2){ //NO COMPILA
//            System.out.println("Missing or invalid input 3");
//        }

//        try {
//            throw new IOException();
//        }catch (FileNotFoundException | IOException p){ //NO COMPILA PORQUE SON CLASES QUE TIENEN RELACION
//
//        }

        //NO COMPILA - finally debe ir al ultimo
//        try {
//            hop();
//        } finally {
//            System.out.println("ff");
//        }catch (Exception e){
//            System.out.println("xx");
//        }

        // NO COMPÏLA TRY SOLO
//        try {
//            hop();
//        }

        //SI COMPILA
        try {
//            hop();
            System.out.println("X");
        }finally {
            System.out.println("OK");
        }

        ///////////////////*********************

        //salida  tfa
        StringBuilder sb = new StringBuilder();
        try {
            sb.append("t");
        }catch (Exception e){
            sb.append("c");
        }finally {
            sb.append("f");
        }
        sb.append("a");
        System.out.println(sb.toString());

        System.out.println("***********");
        System.out.println(goHome());

        System.out.println("***********");



        System.out.println("***********");

        //UNICO CASO DONDE NO SE EJECUTA EL FINALLY
        try {
            System.exit(0);
        }finally {
            System.out.println("NEVER"); // NO PRINTED
        }
    }

    private static void hop() {
        throw new RuntimeException("cannot hop");
    }

    static void pong() throws IOException{
        throw new IOException();
    }

    void explore(){
        try {
            fall();
            System.out.println("nunca me voy a ejecutar");
        }catch (RuntimeException e){
            System.out.println("entre al catch");
        }
        System.out.println("sali del try");
    }

    static void fall (){
        throw new RuntimeException();
    }

    static void explore2(){
        try {
            fall();
        }catch (Exception e){
            fall();
        }finally {
            fall();
        }
        fall();
    }

    //imprime 1 y 3 retorna -3
    static int goHome(){
        try {
            System.out.println("1");
            return -1;
        }catch (Exception e){
            System.out.println("2");
            return -2;
        }finally {
            System.out.println("3");
            return -3;
        }
    }

}
