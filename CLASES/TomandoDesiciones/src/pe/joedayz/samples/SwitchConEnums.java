package pe.joedayz.samples;

public class SwitchConEnums {

    String getWeather(Season value){
        return switch (value){
            case WINTER -> "Cold";
            case SPRING -> "Rainy";
            case SUMMER -> "Hot";
            case FALL -> "Warn";
//            default -> "otro";
        };
    }

    public static void main(String[] args) {

    }
}
