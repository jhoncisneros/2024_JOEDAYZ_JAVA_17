package pe.joedayz.samples;

import java.util.Arrays;
import java.util.List;

public class LowerWilcardDemo {

    private static void printOnlyIntegersClassOrSuperClass(List<? super Integer> list){
//        list.add(10); //ERROR EN TIEMPO DE EJECUCION
        for (Object p: list){
            System.out.println(p);
        }
    }

    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(4,5,6,7);
//        list1.add(8); //ERROR EN TIEMPO DE EJECUCION
        printOnlyIntegersClassOrSuperClass(list1);

        List<Number> list2 = Arrays.asList(0,1,2,3);
        printOnlyIntegersClassOrSuperClass(list2);

    }
}
