package pe.joedayz.samples;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class OtroGenerico {

    public static void main(String[] args) {

        List<?> list1 = new ArrayList<A>();
        List<? extends A> list2 = new ArrayList<A>();
        List<? super A> list3 = new ArrayList<A>();

        list1 = new ArrayList<B>();
        list1 = new ArrayList<String>();

        list2 = new ArrayList<A>();
        list2 = new ArrayList<B>();
        list2 = new ArrayList<C>();

//        list3 = new ArrayList<B>(); //NO COMPILA
//        list3 = new ArrayList<C>(); //NO COMPILA

//        List<? extends B> list4= new ArrayList<A>(); //NO COMPILA
        List<? super B> list5 = new ArrayList<A>();
        list5 = new ArrayList<Object>();

//        List<?> list6 = new ArrayList<? extends A>(); //ERROR

    }

}

class A{}

class B extends A{}

class C extends B{}
