package pe.joedayz.samples.InnerClass;

public class Ride {

    static class Ride2 {

        private int price = 6;
    }

    public static void main(String[] args) {
        var ride = new Ride2();
        System.out.println(ride.price);
    }
}
