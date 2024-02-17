package pe.joedayz.samples.enums;

public enum Season {

    WINTER, SPRING, SUMMER, FALL;
//    WINTER, SPRING, SUMMER, FALL //TAMBIEN FUNCIONA
}

//enum ExtendedSeason extends Season {} //NO COMPILA

class MainEnum {

    public static void main(String[] args) {
        var s = Season.SUMMER;
        System.out.println(Season.SUMMER);
        System.out.println(s == Season.SUMMER);

        for (var season : Season.values()){
            System.out.println(season.name() + " " + season.ordinal());
        }

//        if(Season.SUMMER == 2){} //NO COMPILA

        Season s2 = Season.valueOf("WINTER");
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