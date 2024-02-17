package pe.joedayz.samples;

import java.util.*;

public class Resumen {

    public static void main(String[] args) {
//        System.out.println("system esta en java.lang.*");
//        Random random = new Random();

//        Queue<String> x = new PriorityQueue<String>();
//        x.add("one");
//        System.out.println(x.poll());
//        x.add("two");
//        System.out.println(x.poll());
//        x.add("TWO");
//        System.out.println(x.poll());

        List<String> x = new ArrayList<String>();
        x.add(" x");
        x.add("xx");
        x.add("Xx");

//        Collections.sort(x);
//        Comparable c = Collections.reverse();
//        Comparator c = Collections.reverse();
//        Comparable c = Collections.reverseOrder();
        Comparator c = Collections.reverseOrder();
        Collections.sort(x, c);
//        Collections.sort(x);

        for (String s: x){
            System.out.println(s);
        }
    }
}
