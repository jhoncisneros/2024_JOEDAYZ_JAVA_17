package pe.joedayz.samples;

import java.util.*;

public class Main {

//    void use(List<> data){ //NO COMPILA
//
//    }

    public static void main(String[] args) {

//      List<> list = new ArrayList<Integer>(); //NO COMPILA

        Collection<String> list = new ArrayList<>();
        System.out.println(list.add("Sparrow"));
        System.out.println(list.add("Sparrow"));

        Collection<String> set = new HashSet<>();
        System.out.println(set.add("Sparrow"));
        System.out.println(set.add("Sparrow"));

        System.out.println("===================");

        Collection<String> birds = new ArrayList<>();
        birds.add("hawk");
        birds.add("hawk");
        System.out.println(birds.remove("cardinal"));
        System.out.println(birds.remove("hawk"));
        System.out.println(birds);

        System.out.println("===================");

        Collection<String> birds2 = new ArrayList<>();
        System.out.println(birds2.isEmpty());
        System.out.println(birds2.size());
        birds2.add("hawk");
        birds2.add("hawk");
        System.out.println(birds2.isEmpty());
        System.out.println(birds2.size());

        System.out.println("===================");

        Collection<String> birds3 = new ArrayList<>();
        birds3.add("hawk");
        birds3.add("hawk");
        System.out.println(birds3.isEmpty());
        System.out.println(birds3.size());
        birds3.clear();
        System.out.println(birds3.isEmpty());
        System.out.println(birds3.size());

        System.out.println("===================");

        Collection<String> birds4 = new ArrayList<>();
        birds4.add("hawk");
        System.out.println(birds4.contains("hawk"));
        System.out.println(birds4.contains("robin"));

        System.out.println("===================");

        Collection<String> birds5 = new ArrayList<>();
        birds5.add("Magician");
        birds5.add("Assistant");
        System.out.println(birds5);
        birds5.removeIf(s -> s.startsWith("A"));
        System.out.println(birds5);

        System.out.println("===================");

        Collection<String> set2 = new HashSet<>();
        set2.add("Wand");
        set2.add("");
        System.out.println(set2);
        set2.removeIf(String::isEmpty); //s -> s.isEmpty()
        System.out.println(set2);

        System.out.println("===================");

        Collection<String> cats = List.of("Annie", "Ripley");
        cats.forEach(System.out::println);
        cats.forEach(x -> System.out.println(x));

        System.out.println("===================");

        for (String element: cats)
            System.out.println(element);

        Iterator<String> iter = cats.iterator();
        while(iter.hasNext()){
            String string = iter.next();
            System.out.println(string);
        }

        System.out.println("===================");

        var list11 = List.of(1,2);
        var list22 = List.of(2,1);
        var set11 = Set.of(1,2);
        var set22 = Set.of(2,1);

        System.out.println(list11.equals(list22));
        System.out.println(set11.equals(set22));
        System.out.println(list11.equals(set11));

        System.out.println("===================");

        var heights = new ArrayList<Integer>();
        heights.add(null);
//        int h = heights.get(0); //NULL POINTER

        

    }

}
