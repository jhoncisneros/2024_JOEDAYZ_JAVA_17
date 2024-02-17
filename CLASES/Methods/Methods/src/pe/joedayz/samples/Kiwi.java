package pe.joedayz.samples;

public class Kiwi {

    public void fly(int numMiles){
        System.out.print("int");
    }

    public void fly(Integer numMiles){
        System.out.print("Integer");
    }

    public static void main(String[] args) {
        var k = new Kiwi();
        k.fly(3);
        k.fly(new Integer(3));
    }

}
