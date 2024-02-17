package pe.joedayz.samples;

public class Pelican {

    public void fly(String s){
        System.out.println("string");
    }

    public void fly(Object o){
        System.out.println("object");
    }

    public static void main(String[] args) {
        var p = new Pelican();
        p.fly("Test");
        System.out.println("-");
        p.fly(56);
    }
}
