package pe.joedayz.samples;

public class CandyCounter {

    static double addCandy(double fruit, float vegetables){
        System.out.println(fruit);
        System.out.println(vegetables);
        System.out.println(fruit+vegetables);
        return (int)fruit+vegetables;
    }

    public static void main(String[] args) {
//        System.out.println(addCandy(1.4, 2.4f) + ", ");
//        System.out.println(addCandy(1.9, (float)4) + ",");
//        System.out.println(addCandy((long)(int)(short)2, (float)4));

//        int ph = 7, vis = 2;
//        boolean clear = vis> 1 & (vis <9 || ph < 2);
//        boolean safe = (vis > 2) && (ph++> 1);
//        boolean tasty = 7 <= --ph;
//
//        System.out.println(clear + "-" + safe + "-" + tasty);

//        int pig = (short) 4;
//        pig = pig++;
////        pig++;
//        long goat = (int) 2;
//        goat -= 1.0;
//        System.out.println(pig + " - " + goat);

//        int a = 2, b = 4, c = 2;
//        System.out.println(a> 2 ? --c : b++);
//        System.out.println(b = (a!=c ? a : b++));
//        System.out.println(a> b ? b < c ? b : 2 : 1);

//        short height = 1, weight = 3;
//        short zebra = (byte) weight * (byte) height;
//        double ox = 1 + height * 2 + height;
//        long giraffe = 1 + 9 % height + 1;
//
//        System.out.println(zebra);
//        System.out.println(ox);
//        System.out.println(giraffe);

        int sample1 = (2 * 4) % 3;
        int sample2 = 3 * 2 % 3;
        int sample3 = 5 * (1 % 2);

        System.out.println(sample1);
        System.out.println(sample2);
        System.out.println(sample3);
    }
}
