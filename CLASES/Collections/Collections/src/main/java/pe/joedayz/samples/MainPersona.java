package pe.joedayz.samples;

import java.util.ArrayList;
import java.util.List;

public class MainPersona {

    public static void main(String[] args) {

        List<Persona> personaList = new ArrayList<>();
        personaList.add(new Persona("pepe"));
        personaList.add(new Persona("miryam"));
        imprimir(personaList);
    }

    private static void imprimir(List<Persona> personaList){
        for (Persona p: personaList){
            System.out.println(p.getNombre());
        }
    }
}
