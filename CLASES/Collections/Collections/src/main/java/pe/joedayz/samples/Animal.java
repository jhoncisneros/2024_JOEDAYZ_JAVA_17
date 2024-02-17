package pe.joedayz.samples;

public class Animal implements Comparable<Animal> {

    private int id;

    @Override
    public int compareTo(Animal a) {
        return id - a.id; //ORDEN ASCENDENTE
    }

    public static void main(String[] args) {
        var a1 = new Animal();
        var a2 = new Animal();
        a1.id = 5;
        a2.id = 7;

        System.out.println(a1.compareTo(a2)); // -2
        System.out.println(a1.compareTo(a1)); //0
        System.out.println(a2.compareTo(a1)); //2
    }
}
