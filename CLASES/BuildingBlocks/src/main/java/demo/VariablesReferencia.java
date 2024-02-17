package demo;

import java.util.Date;

public class VariablesReferencia {

    Date diaActual;
    String greeting = new String("Peru");
    int longitud = greeting.length();
    long enteroLargo = longitud;
    short enteroCorto;
//    int value = null;
    Boolean activo = Boolean.valueOf("true");//Boolean.valueOf(true);
    boolean status = activo;

    Character caracter = Character.valueOf('a');

    public static void main(String[] args) {
        int primitive = Integer.parseInt("123");
        Integer wrapper = Integer.valueOf("123");

        double applePrimitive = Double.parseDouble("200.99");
        Double apple = Double.valueOf("200.99");

        System.out.println(Integer.max(15, 10));
        System.out.println(Integer.min(15, 10));
        System.out.println(Integer.sum(15, 10));


//        System.out.println(primitive);
//        System.out.println(wrapper);
//        System.out.println(apple);
//        System.out.println(apple.byteValue());
//        System.out.println(apple.intValue());
//        System.out.println(apple.doubleValue());
    }
}
