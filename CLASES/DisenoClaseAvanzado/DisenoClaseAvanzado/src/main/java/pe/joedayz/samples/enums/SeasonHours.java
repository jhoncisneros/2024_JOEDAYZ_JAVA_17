package pe.joedayz.samples.enums;

interface Weather {
    int getAverageTemperature();
}

public enum SeasonHours implements Weather {

    WINTER{
        public String getHours(){
            return "10am-3pm";
        }
        public int getAverageTemperature(){
            return 50;
        }
    }, SUMMER{
        public String getHours(){
            return "9am-7pm";
        }
    }, SPRING, FALL;

//    public abstract String getHours();

    public String getHours(){
        return "9am-5pm";
    }

    public int getAverageTemperature(){
        return 30;
    }
}

class MainEnum3 {

    public static void main(String[] args) {

        System.out.println(SeasonHours.SUMMER.getHours());
        System.out.println(SeasonHours.SPRING.getHours());

        var s = SeasonHours.SUMMER;
        System.out.println(SeasonHours.SUMMER);
        System.out.println(s == SeasonHours.SUMMER);

        for (var season : SeasonHours.values()){
            System.out.println(season.name() + " " + season.ordinal());
        }

//        if(Season.SUMMER == 2){} //NO COMPILA

        SeasonHours s2 = SeasonHours.valueOf("WINTER");
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


