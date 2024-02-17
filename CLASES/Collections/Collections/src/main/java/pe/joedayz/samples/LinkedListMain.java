package pe.joedayz.samples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListMain {

    public static void main(String[] args) {

        var linked1 = new LinkedList<String>();
        var linked2 = new LinkedList<String>(linked1);

        var list1 = new ArrayList<String>();
        var list2 = new ArrayList<String>(list1);
        var list3 = new ArrayList<String>(10);

        var strings = new ArrayList<String>();
        strings.add("a");
        for (String s: strings){

        }

        var list = new ArrayList<>();
        list.add("a");
//        for (String s: list){ //NO COMPILA
//
//        }

        List<String> listNew = new ArrayList<>();
        listNew.add("SD");
        listNew.add(0, "NY");
        listNew.set(1, "FL");
        System.out.println(listNew);
        System.out.println(listNew.get(0));
        listNew.remove("NY");
        listNew.remove(0);
//        listNew.set(0, "?"); // NO COMPILA IndexOutOfBoundsException
        System.out.println(listNew);

        var numbers = Arrays.asList(1,2,3);
        numbers.replaceAll(x -> x * 2);
        System.out.println(numbers);

        var list10 = new ArrayList<Integer>();
        list10.add(3);
        list10.add(2);
        list10.add(1);
        System.out.println(list10);
        list10.remove(2);
        System.out.println(list10);
        list10.remove(Integer.valueOf(2));
        System.out.println(list10);
    }
}
