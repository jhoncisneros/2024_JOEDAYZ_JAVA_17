package pe.joedayz.samples;

public class Ternario {

    public static void main(String[] args) {

        int owl  = 5;
        int food = owl < 2 ? 3 : 4;

        System.out.println(food);

//        int food;
//        if(owl < 2){
//            food = 3;
//        }else{
//            food = 4;
//        }
//
//        System.out.println(food);

        int food22 = (owl <4 ? ((owl > 2) ? 3 : 4 ) : 5);

        int stripes = 7;
        System.out.println(stripes>5 ? 21 : "Zebra");

//        int animal = stripes>5 ? 21 : "Zebra"; //NO COMPILA

        var t = stripes>5 ? 21 : "Zebra";
        System.out.println(t);

        int sheep = 1;
        int zzz = 1;
        int sleep = zzz < 10 ? sheep++ : zzz++;
        System.out.println(sheep + ", " + zzz);
    }
}
