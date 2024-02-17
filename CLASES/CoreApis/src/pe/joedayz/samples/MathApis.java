package pe.joedayz.samples;

public class MathApis {

    public static void main(String[] args) {

        int first = Math.max(3, 7);
        int second = Math.min(7, -9);

        System.out.println(first);
        System.out.println(second);

        long low = Math.round(123.45);
        long high = Math.round(123.50);
        int fromFloat = Math.round(123.45f);

        System.out.println(low);
        System.out.println(high);
        System.out.println(fromFloat);

        double c = Math.ceil(3.14);
        double f = Math.floor(3.14);

        System.out.println(c);
        System.out.println(f);

        double squared = Math.pow(5, 2);
        System.out.println(squared);

        double num = Math.random(); // <= 0 < 1.0
        System.out.println(num);
    }
}
