package pe.joedayz.samples;

public class SwitchConResultado {

    public void printSeasonFrom(int month){
        switch (month){
            case 1,2,3 -> System.out.println("Winter");
            case 4,5,6 -> System.out.println("Spring");
            case 7,8,9 -> System.out.println("Summer");
            case 10,11,12 -> System.out.println("Fall");
        }
        System.out.println("continuar con mi trabajo");
    }

    public void printDayOfWeek(int day) {
        var result = switch (day){
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 6 -> "Saturday";
            default -> "Invalid Value";
        };

        System.out.println(result);

        int bear = 5;
        var result2 = switch (bear){
            case 30 -> "Grizly";
            default -> throw new RuntimeException("hola");
        };

        System.out.println(result2);
    }

    public static void main(String[] args) {
        SwitchConResultado switchConResultado = new SwitchConResultado();
        switchConResultado.printSeasonFrom(100);

        int measurement = 10;
        int size = switch (measurement){
            case 5 -> 1;
            default -> 5;
            case 10 -> (short) 2;
        };

        System.out.println(size);
    }
}
