package pe.joedayz.samples;

public interface Schedlue {

    default void wakeUp(){
        checkTime(7);
        workOut();
        haveBreakfast();
    }

    private void haveBreakfast() {
        checkTime(9);
        workOut();
    }

    static void workOut(){
        checkTime(18);
    }

    private static void checkTime(int hour){
        if(hour>17){
            System.out.println("you're late!");
        }else{
            System.out.println("You have " + (17-hour) + " hours left " + "to make yhe appointment");
        }
    }
}
