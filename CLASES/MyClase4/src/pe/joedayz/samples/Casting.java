package pe.joedayz.samples;

public class Casting {

    public static void main(String[] args) {

        int fur = (int) 5;
        int hair = (short) 2;
        String type = (String) "Bird";

        short tail = (short)(4 + 10);

//        long feathers = 10 (long); NO COMPILA
        long feathers = 10;

//        float egg = 2.0/9; BNO COMPILA
        float egg = (float) 2.0/9;
        int tadpole = (int) (5 * 2l);

        int tadpole2 = 5 * (int) 2l;
        int tadpole3 = 5 * (short) 2l;

//        int fish = 1.0; NO COMPILA
//        short bird = 1921222; NO COMPILA
//        int mammal = 9f; NO COMPILA
//        long reptile = 192_301_398_193_810_323; NO COMPILA

        int fish = (int) 1.0;
        short bird = (short) 1921222;
        int mammal = (int) 9f;
//        long reptile = (long) 192_301_398_193_810_323; NO COMPILE

        short mouse = 10;
        short hamster = 3;
//        short capybara = mouse * hamster; //NO COMPILA
//        short capybara0 = (short) mouse * hamster; //NO COMPILA
        short capybara = (short) (mouse * hamster);
        short otrocapybara = 10 * 3;

        byte hat = 1;
        byte gloves = 7 * 10;
        short scarf = 5;
        short boots = 2 + 1;

//        short boots2 = 2 + hat; //NO COMPILA

        int camel = 2, giraffe = 3;
        camel = camel * giraffe;
        camel *=giraffe;

        long goat = 10;
        int sheep = 5;

//        sheep = sheep * goat; //NO COMPILA
        sheep *= goat; //EL COMPILADOR AUTOMATICAMENTE CASTEA EL TIPO DE DATO DEL LADO IZQUIERDO

        long wolf = 5;
        long coyote = (wolf = 3);

        boolean healthy = false;
        if(healthy=true){
            System.out.println("Good!");
        }

//        System.out.println(wolf);
//        System.out.println(coyote);

    }
}
