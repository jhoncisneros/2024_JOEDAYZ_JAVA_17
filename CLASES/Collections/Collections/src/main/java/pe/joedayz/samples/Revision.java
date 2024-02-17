package pe.joedayz.samples;

import java.io.FileNotFoundException;
import java.util.*;

public class Revision {

    public static void main(String[] args) {

        List<?> q = List.of("mouse", "parrot");
        var v = List.of("mouse", "parrot");
//        q.removeIf(String::isEmpty); //NO COMPILA
//        q.removeIf(s -> s.length() == 4); //NO COMPILA
//        v.removeIf(String::isEmpty); //ERROR EN TIEMPO DE EJECUCION
//        v.removeIf(s -> s.length() == 4); //ERROR EN TIEMPO DE EJECUCION

        var greetings = new ArrayDeque<String>();
        greetings.offerLast("hello");
        greetings.offerLast("hi");
        greetings.offerFirst("ola");
        greetings.pop();
        greetings.peek();
        while(greetings.peek() != null){
            System.out.println(greetings.pop());
        }

//        HashSet<Number> hs = new HashSet<Integer>(); //NO COMPILA
        HashSet<? super ClassCastException> set = new HashSet<Exception>();
//        List<> list = new ArrayList<String>(); //NO COMPILA
//        List<Object> values = new HashSet<Object>(); //NO COMPILA
//        List<Object> objects = new ArrayList<? extends Object>(); //NO COMPILA
        Map<String, ? extends Number> hm = new HashMap<String, Integer>();


    }
}

record Hello<T>(T t){
    public Hello(T t){
        this.t = t;
    }
    private <T> void println(T message){
        System.out.println(t + "-" + message);
    }

    public static void main(String[] args) {
        new Hello<String>("hi").println(1);
        new Hello("hola").println(true);
    }
}

record Platypus(String name, int beakLength){

    @Override
    public String toString() {
        return "" + beakLength;
    }

    public static void main(String[] args) {
        Platypus p1 = new Platypus("paula", 3);
        Platypus p2 = new Platypus("peter", 5);
        Platypus p3 = new Platypus("peter", 7);

        List<Platypus> list = Arrays.asList(p1, p2, p3);

//        Collections.sort(list, Comparator.comparing(Platypus::beakLength)); //[3, 5, 7]
        Collections.sort(list, Comparator.comparing(Platypus::beakLength).reversed()); //OK [7, 5, 3]
//        Collections.sort(list, Comparator.comparing(Platypus::name).thenComparing(Platypus::beakLength)); //[3, 5, 7]
//        Collections.sort(list, Comparator.comparing(Platypus::name).thenComparing(Comparator.comparing(Platypus::beakLength).reversed())); //[3, 7, 5]
//        Collections.sort(list, Comparator.comparing(Platypus::name).thenComparingNumber(Platypus::beakLength).reversed()); //NO COMPILA
        Collections.sort(list, Comparator.comparing(Platypus::name).thenComparingInt(Platypus::beakLength).reversed()); //OK [7, 5, 3]

        System.out.println(list);

        var list1 = List.of(1,2,3);
        var set = Set.of(1,2,3);
        var map = Map.of(1,2,3,4);

        list1.forEach(System.out::println);
        set.forEach(System.out::println);
//        map.forEach(System.out::println); //NO COMPILA
//        map.keys().forEach(System.out::println); //NO COMPILA
        map.keySet().forEach(System.out::println);
        map.values().forEach(System.out::println);
//        map.valueSet().forEach(System.out::println); //NO COMPILA
    }
}

class Alpaca {

    public List<String> hairy(List<String> list){
        return null;
    }

//    public List<String> hairy(List<CharSequence> list){
//        return null;
//    }

//    public List<String> hairy(ArrayList<String> list){
//        return null;
//    }

//    public List<String> hairy(List<Integer> list){
//        return null;
//    }

//    public List<CharSequence> hairy(List<String> list){
//        return null;
//    }

//    public Object hairy(List<String> list){
//        return null;
//    }

//    public ArrayList<String> hairy(List<String> list){
//        return null;
//    }
}

class MyComparator implements Comparator<String>{

    @Override
    public int compare(String a, String b) {
        return b.toLowerCase().compareTo(a.toLowerCase());
    }

    public static void main(String[] args) {

        String[] values = {"123", "Abb", "aab"};
        Arrays.sort(values, new MyComparator());
        for(var s: values){
            System.out.println(s + " ");
        }
    }
}

class Helper {
    public static <U extends Exception> void printException(U u){
        System.out.println(u.getMessage());
    }

    public static void main(String[] args) {
        Helper.printException(new FileNotFoundException("A"));
        Helper.printException(new Exception("B"));
//        Helper.<Throwable>printException(new Exception("C")); //NO COMPILA
        Helper.<NullPointerException>printException(new NullPointerException("D"));
//        Helper.printException(new Throwable("E")); //NO COMPILA
    }
}