package pe.joedayz.samples;

public class UnaryMain {

    public static void main(String[] args) {
        boolean isAnimalAsleep = false;
        System.out.println(isAnimalAsleep);
        System.out.println(!isAnimalAsleep);

        int value = 3; //0011
        int complement = ~value; //1100
        System.out.println(value);
        System.out.println(complement);

        System.out.println(-1*value-1);
        System.out.println(-1*complement-1);

        double zooTemperature = 1.21;
        System.out.println(zooTemperature);
        System.out.println(-zooTemperature);
        System.out.println(-(-zooTemperature));
    }
}
