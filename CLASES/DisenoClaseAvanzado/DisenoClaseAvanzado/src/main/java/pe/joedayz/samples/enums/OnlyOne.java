package pe.joedayz.samples.enums;

public enum OnlyOne {

    ONCE(true);


    OnlyOne(boolean b) {
        System.out.println("Contructing,");
    }
}

class PrintTheOne {

    public static void main(String[] args) {
        System.out.println("Begin,");

        OnlyOne firstCall = OnlyOne.ONCE; //EL ENUM SE CARGA SOLO UNA VEZ

        OnlyOne secondCall = OnlyOne.ONCE;

        System.out.println("End");
    }
}
