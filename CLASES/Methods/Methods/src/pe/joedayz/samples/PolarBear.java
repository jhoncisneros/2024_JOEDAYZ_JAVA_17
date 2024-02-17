package pe.joedayz.samples;

public class PolarBear {

    final int age = 10;
    final int fishEaten; //default 0
    final String name; //default null

    {
        fishEaten = 10;
        System.out.println("1");
    }

    public PolarBear(){
        name = "joe";
        System.out.println("3");
    }

    public static void main(String[] args) {
        PolarBear polarBear = new PolarBear();
    }

    {
        System.out.println("2");
    }
}
