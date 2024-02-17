package pe.joedayz.samples;

import java.util.ArrayList;
import java.util.List;

public class OrdenandoLista {

    public static void main(String[] args) {

        List<String> bunnies = new ArrayList<>();
        bunnies.add("long ear");
        bunnies.add("floppy");
        bunnies.add("hoppy");
        System.out.println(bunnies);

        bunnies.sort((b1, b2) -> b1.compareTo(b2));
        System.out.println(bunnies);
    }
}
