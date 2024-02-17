package pe.joedayz.samples;

import java.util.ArrayList;
import java.util.List;

public class MainDeportista {

    public static void main(String[] args) {

        List<Deportista> deportistaList = new ArrayList<>();
        deportistaList.add(new Deportista("pepe", "futbol"));
        deportistaList.add(new Deportista("miryam", "voley"));
        imprimir(deportistaList);
    }

    private static void imprimir(List<? extends Persona> lista){
        for (Object p: lista){
            System.out.println(((Deportista) p).getDeporte());
            System.out.println(((Deportista) p).getNombre());
        }
    }
}
