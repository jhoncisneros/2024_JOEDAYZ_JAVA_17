package pe.joedayz.samples;

import java.util.*;

public class Wildcard {

    public void showSize(List<?> list){
        System.out.println(list.size());
    }

    public static void main(String[] args) {

        Wildcard card = new Wildcard();

//        List<?> list = new HashSet<String>(); //NO COMPILA
        ArrayList<? super Date> list2 = new ArrayList<Date>();
//        List<?> list = new ArrayList<?>(); //NO COMPILA
//        List<Exception> list = new LinkedList<java.io.IOException>(); //NO COMPILA
        ArrayList<? extends Number> list = new ArrayList<Integer>();

        card.showSize(list);
    }
}
