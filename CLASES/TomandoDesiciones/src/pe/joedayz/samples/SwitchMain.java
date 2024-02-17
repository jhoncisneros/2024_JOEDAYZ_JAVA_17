package pe.joedayz.samples;

public class SwitchMain {

    public static void main(String[] args) {
        int animal = 10;

//        switch (animal){
//            case 1:
//                System.out.println("Lion");
//                break;
//            case 2:
//                System.out.println("Lion");
//                break;
//            case 3:
//                System.out.println("Tiger");
//                break;
//        }

        switch (animal){
            case 1, 2:
                System.out.println("Lion");
                break;
            case 3:
                System.out.println("Tiger");
                break;
            default:
                System.out.println("no se que animal es");
        }
    }

    public void printDayOfWeek(int day){
        switch (day){
            case 0:
                System.out.println("Sunday");
            case 1:
                System.out.println("Monday");
                break;
            case 6:
                System.out.println("Saturaday");
                break;
            default:
                System.out.println("invalid value");
                break;
        }
    }

    public void printSeason(int month){
        switch (month){
            case 1,2,3:
                System.out.println("Winter");
            case 4,5,6:
                System.out.println("Spring");
            default:
                System.out.println("UNkNOW");
            case 7,8,9:
                System.out.println("Summer");
            case 10,11,12:
                System.out.println("Fall");
        }
    }
}
