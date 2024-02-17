package pe.joedayz.samples;

import java.io.File;

public class ComparandoValores {

    public static void main(String[] args) {
//        boolean monkey = true == 3; //NO COMPILA
//        boolean ape = false != "Gape"; //NO COMPILA
//        boolean gorilla = 10.2 == "Koko"; //NO COMPILA

        boolean bear = false;
        boolean polar = (bear=true);

        var monday = new File("schedule.txt");
        var tuesday = new File("schedule.txt");
        var wednesday = tuesday;

//        System.out.println(monday == tuesday); //false
//        System.out.println(tuesday == wednesday); // true

//        System.out.println(null == null); //true

        int gibbonNumFeet = 2, wolfNumFeet = 4, ostrichNumFeet = 2;
//        System.out.println(gibbonNumFeet < wolfNumFeet); //true
//        System.out.println(gibbonNumFeet <= wolfNumFeet); //true
//        System.out.println(gibbonNumFeet >= ostrichNumFeet); //true
//        System.out.println(gibbonNumFeet > ostrichNumFeet); //false

        Integer zooTime = Integer.valueOf(9);
        Number num = zooTime;
        Object obj = zooTime;

        openZoo(num);
        openZoo(zooTime);
        openZoo(15);

        System.out.println(null instanceof Object);

        Object noObjectHere = null;

        System.out.println(noObjectHere instanceof String);

//        System.out.println(null instanceof null); //NO COMPILA
    }

    public static void openZoo(Number time){
        if(time instanceof Integer){
            System.out.println((Integer) time + " o'clock");
        }else{
            System.out.println(time);
        }
    }
}
