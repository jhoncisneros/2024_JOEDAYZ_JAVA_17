package pe.joedayz.samples;

import java.util.ArrayList;
import java.util.List;

public class LimitesEnGenericos {

    public static void printList(List<Object> list){
        for (Object x: list)
            System.out.println(x);
    }

    public static void printList2(List<?> list){
        for (Object x: list)
            System.out.println(x);
    }

    public static long total(List<? extends Number> list){
        long count = 0;
        for (Number number: list){
            count += number.longValue();
        }
        return count;
    }

    //ERASURE - EL COMPILADOR ELIMINA LOS GENERICOS QUEDANDO ASI
//    public static long total(List list){
//        long count = 0;
//        for (Object obj: list){
//            Number number = (Number) obj;
//            count += number.longValue();
//        }
//        return count;
//    }

    public static void main(String[] args) {
        List<String> keywords = new ArrayList<>();
        keywords.add("java");
//        printList(keywords); //ESTO NO COMPILA PORQUE UN LIST DE STRING ES DISTINTO DE UN LIST DE OBJECT

        List<Integer> numbers = new ArrayList<>();
        numbers.add(Integer.valueOf(42));
//        List<Object> objects = numbers; //NO COMPILA POR SE LIST DIFERENTES
//        objects.add("forty two");
//        System.out.println(numbers.get(1));

        List<String> keywords2 = new ArrayList<>();
        keywords2.add("java");
        printList2(keywords2);

        List<?> x1 = new ArrayList<>();
        var x2 = new ArrayList<>();

        List<Object> objectList = new ArrayList<>();
//        objectList.add(x1);
//        objectList.add(x2);

        x1 = objectList;
//        x2 = objectList; //NO COMPILA PORQUE ESTÄ TRATANDO DE ASIGNAR UN LIST A UNA CLASE

//        ArrayList<Number> list = new ArrayList<Integer>(); //NO COMPILA PORQUE SON 2 TIPOS DISTINTOS (NUMBER E INTEGER)
        ArrayList<? extends Number> list = new ArrayList<Integer>(); //INDICA QUE SON HIJOS DE NUMBER

        //List<Bird>
        //List<Sparrow>
        List<? extends Bird> birds = new ArrayList<Bird>();
//        birds.add(new Sparrow()); //NO COMPILA
//        birds.add(new Bird()); //NO COMPILA

        List<Sparrow> listSparrow = new ArrayList<>();
        birds = listSparrow;

        //******************************
//        ArrayList<Number> listNumber = new ArrayList<Integer>(); //NO COMPILA
        List<? extends Number> listNumber = new ArrayList<Integer>();

    }

    static class Sparrow extends Bird {}

    static class Bird{}
}


