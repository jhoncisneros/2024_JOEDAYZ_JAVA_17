package pe.joedayz.samples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Optional;

public class MultiFieldComparator implements Comparator<Squirrel> {

    @Override
    public int compare(Squirrel s1, Squirrel s2) {
        int result = s1.getSpecies().compareTo(s2.getSpecies());
        if(result !=0)
            return result;
        return s1.getWeight() - s2.getWeight();
    }

    public static void main(String[] args) {
        var squirrels = new ArrayList<Squirrel>();
//        products.add(new Product(null));
        squirrels.add(new Squirrel(7,"Quack"));
        squirrels.add(new Squirrel(10,"Puddles"));
        System.out.println(squirrels);
//        Collections.sort(squirrels);//NO COMPILA

        Collections.sort(squirrels, new MultiFieldComparator());
        System.out.println(squirrels);

        Comparator<Squirrel> c1 = Comparator.comparing(Squirrel::getSpecies).thenComparingInt(Squirrel::getWeight);
        Collections.sort(squirrels, c1);
        System.out.println(squirrels);

        var c2 = Comparator.comparing(Squirrel::getSpecies).reversed();
        Collections.sort(squirrels, c2);
        System.out.println(squirrels);

        Integer num = null;
        String num2 = null;
//        String valor = String.valueOf(num);
        String valor = String.valueOf(num);
        System.out.println(valor);
        Optional<String> optional = Optional.ofNullable(String.valueOf(num));
        Optional<String> optional2 = Optional.ofNullable("null".equals(String.valueOf(num)) ? null : String.valueOf(num));
        Optional<String> optional3 = Optional.ofNullable(num2);
        String valorx = optional.orElse("Valor predeterminado");
        String valory = optional2.orElse("Valor predeterminado 222");
        String valorz = optional3.orElse(" ");
//        String optionalString = Optional.ofNullable(valor).orElse("");

//        String valors = optional.orElse(" ");
        if(valor == null){
            System.out.println("OKK");
        }

//        System.out.println(optionalString);
        System.out.println(optional.isPresent());
        System.out.println(valorx);
        System.out.println(valory);
        System.out.println(valorz);
        System.out.println(valorz.isBlank());
        System.out.println(valorz.isEmpty());
        System.out.println(num);
//        System.out.println(valor.isEmpty());
//        System.out.println(valor.isBlank());

//        System.out.println(valors);
//        System.out.println(valors.isBlank());
//        System.out.println(valors.isEmpty());

    }
}
