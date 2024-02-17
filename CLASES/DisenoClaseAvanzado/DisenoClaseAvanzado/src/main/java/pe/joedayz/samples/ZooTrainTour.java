package pe.joedayz.samples;

public interface ZooTrainTour {

    abstract int getTrainName();

    private static void ride(){

    }

    private void playHorn2(){

    }
    default void playHorn(){
        getTrainName();
        ride();
    }

//    public static void slowDown(){ //NO COMPIAL
//        playHorn();
//        playHorn2();
//    }

    static void speedUp(){
        ride();
    }

}
