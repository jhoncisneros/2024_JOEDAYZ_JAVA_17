package pe.joedayz.samples;

public class Scope {

    public static void main(String[] args) {
        WaterBottle wb = new WaterBottle();
//        float a  = WaterBottle.code;

        String one, two;

        one = new String("a");
        System.out.println(one);
        System.out.println("===================");
        two = new String("b");
        System.out.println(two);
        System.out.println("===================");
        one = two;
        System.out.println(one);
        System.out.println(two);
        System.out.println("===================");

        String three = one;
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        System.out.println("===================");
        one = null;
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
    }
}
