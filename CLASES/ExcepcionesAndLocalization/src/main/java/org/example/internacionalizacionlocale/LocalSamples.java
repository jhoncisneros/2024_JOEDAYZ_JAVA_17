package org.example.internacionalizacionlocale;

import java.util.Locale;

public class LocalSamples {

    public static void main(String[] args) {

        Locale locale = Locale.getDefault();
        //languaje(minuscula)_pais(mayuscula) (NO SE PUEDE ROMPER EL FORMATO SINO FALLA)
        System.out.println(locale); // es_PE (español, perú (Language-contry))

        System.out.println(Locale.GERMAN); // de (language)
        System.out.println(Locale.GERMANY); // de_DE

        System.out.println(new Locale("fr")); // fr
        System.out.println(new Locale("hi", "IN")); //hi_IN

        Locale l1 = new Locale.Builder()
                .setLanguage("en")
                .setRegion("US").build();

        System.out.println(l1); // en_US

        Locale l2 = new Locale.Builder()
                .setRegion("US")
                .setLanguage("en")
                .build();

        System.out.println(l2); // en_US

        System.out.println(Locale.getDefault()); // es_PE
        Locale locale2 = new Locale("fr");
        Locale.setDefault(locale2);
        System.out.println(Locale.getDefault()); // fr

    }
}
