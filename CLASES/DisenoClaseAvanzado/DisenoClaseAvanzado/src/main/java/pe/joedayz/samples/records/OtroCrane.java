package pe.joedayz.samples.records;

public record OtroCrane(int numberEggs, String name) {

    private static int type;
    private static String typeString = "Diez";

//    private int size; //NO COMPILA
//    private boolean friendly; //NO COMPILA

    //NO HAY INICIALIZADOR DE INSTANCIA
//    {
//
//    }

    //INICIALIZADOR DE ESTATICOS
    static {
        type = 25;
    }

    //CONSTRUCTOR COMPACTO
    public OtroCrane{

    }

    public OtroCrane(String name){
        this(1, name);
    }

    public OtroCrane(int numberEggs){
        this(numberEggs, "Otro");
    }

    //SOBREESCRITURA
    @Override
    public int numberEggs(){
        return 13;
    }

    @Override
    public String name(){
        return "Favi";
    }

//    @Override
//    public boolean equals(Object obj) {
//        return false;
//    }
//
//    @Override
//    public int hashCode() {
//        return 0;
//    }
//
//    @Override
//    public String toString() {
//        return null;
//    }
}

class MainOtroCrane {

    public static void main(String[] args) {

        var crane = new OtroCrane("Jhon");
        System.out.println(crane);

        var crane2 = new OtroCrane(10);
        System.out.println(crane2);

        var crane3 = new OtroCrane(0, "Jos");
//        System.out.println(crane3.typeString);
//        System.out.println(crane3.type);
        System.out.println(crane3.numberEggs());
        System.out.println(crane3.name());
    }
}
