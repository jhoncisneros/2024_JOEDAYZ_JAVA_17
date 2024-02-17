package abc;

public class Chick2 {

    private String name = "Fluffy";

    {
        System.out.println("1. setting field");
        System.out.println(name);
    }

    public Chick2(){
        name = "Tiny";
        System.out.println("2. Estoy en el constructor");
    }

    public static void main(String[] args) {
        Chick2 chick2 = new Chick2();
        System.out.println(chick2.name);
    }
}
