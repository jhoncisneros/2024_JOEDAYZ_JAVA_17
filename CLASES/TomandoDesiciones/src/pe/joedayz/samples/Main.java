package pe.joedayz.samples;

import java.util.List;

public class Main {

    void compareIntegersWithList(){
        Number value = 123;
        if(value instanceof List){

        }
        if(value instanceof List data){

        }
    }
    void compareIntegersBad(){
        Integer value = 123;
        if(value instanceof Integer){

        }
//        if(value instanceof Integer data){ //NO COMPILA
//
//        }
    }
    void compareIntegers(Number number){
        if(number instanceof final Integer data && data.compareTo(5)>0){
//            Integer data = (Integer) number;
//            data = 10; //MALA PRACTICA
//            System.out.println(data.compareTo(5)); //0 si son iguales, 1 si es mayor que 5, -1 si soy menor que 5
            System.out.println(data);
        }else{
            System.out.println("No es mayor que 5 o No es Integer");
        }
    }

//    void printIntegerOrNumbersGreaterThan5(Number number){ //NO COMPILA POR FLOW SCOPING
//        if(number instanceof Integer data || data.compareTo(5)>0){
//            System.out.println(data);
//        }
//    }

    void printIntegerTwice(Number number){
        if(number instanceof Integer data){
            System.out.println(data.intValue());
        }

//        System.out.println(data.intValue()); //FLOW SCOPING - QUE TIPO DE DATA ES? SI LLEGÓ DOUBLE EN EL PÄRAMETRO
    }

    void printOnlyIntegers(Number number){
        if(!(number instanceof Integer data)){
            return;
        }

        System.out.println(data.intValue());
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.compareIntegers(Integer.valueOf(5));
        main.compareIntegers(Integer.valueOf(3));
        main.compareIntegers(Integer.valueOf(8));
        main.compareIntegers(Double.valueOf(5.0));
    }
}
