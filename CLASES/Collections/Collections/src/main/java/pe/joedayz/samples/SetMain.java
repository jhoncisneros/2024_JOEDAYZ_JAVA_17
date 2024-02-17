package pe.joedayz.samples;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetMain {

    public static void main(String[] args) {

        Set<Character> letters = Set.of('z', 'i', 'o');
        Set<Character> copy = Set.copyOf(letters);

        System.out.println(letters);
        System.out.println(copy);

        Set<Integer> set = new HashSet<>();
        boolean b1 = set.add(66);
        System.out.println(b1);
        boolean b2 = set.add(10);
        System.out.println(b2);
        boolean b3 = set.add(66);
        System.out.println(b3);
        boolean b4 = set.add(8);
        System.out.println(b4);

        set.forEach(System.out::println);

        System.out.println("=========");

        Set<Integer> set2 = new TreeSet<>();
        boolean s1 = set2.add(66);
        System.out.println(s1);
        boolean s2 = set2.add(10);
        System.out.println(s2);
        boolean s3 = set2.add(66);
        System.out.println(s3);
        boolean s4 = set2.add(8);
        System.out.println(s4);

        set2.forEach(System.out::println);

    }
}
