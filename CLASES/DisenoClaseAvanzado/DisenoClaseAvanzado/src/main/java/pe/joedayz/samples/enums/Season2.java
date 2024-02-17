package pe.joedayz.samples.enums;

public enum Season2 {
    WINTER("Low"), SPRING("Medium"), SUMMER("High"), FALL("Medium");

    private final String expectedVisitors; //BUENA PRACTICA ES QUE ESTOS VALORES SEAN INMUTABLES

    private Season2(String expectedVisitors){ //LOS CONSTRUCTORES DEL ENUM SON IMPLICITAMENTE PRIVADOS
        this.expectedVisitors = expectedVisitors;
    }

    public void printExpectedVisitors(){
        System.out.println(expectedVisitors);
    }
}

class MainEnum2 {

    public static void main(String[] args) {

        Season2.SUMMER.printExpectedVisitors();

        var s = Season2.SUMMER;
        System.out.println(Season2.SUMMER);
        System.out.println(s == Season2.SUMMER);

        for (var season : Season2.values()){
            System.out.println(season.name() + " " + season.ordinal());
        }

//        if(Season.SUMMER == 2){} //NO COMPILA

        Season2 s2 = Season2.valueOf("WINTER");
        System.out.println(s2);
//        Season s3 = Season.valueOf("spring"); //ERROR EN TIEMPO DE EJECUCION

        switch (s){
            case WINTER:
                System.out.println("winter");
                break;
            case SUMMER:
                System.out.println("summer");
                break;
            default:
                System.out.println("ninguno");
        }

        var message = switch (s){
//          case 0 -> "Que calor"; //NO COMPILA, NO USAR EL ORDINAL
//          case Season.FALL -> "que otoño"; //NO COMPILA
            case WINTER -> "que frio";
            default -> "ninguno message";
        };
        System.out.println(message);

    }
}
