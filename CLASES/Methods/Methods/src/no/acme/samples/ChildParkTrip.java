package no.acme.samples;

import pe.joedayz.samples.ParkTrip;

public class ChildParkTrip extends ParkTrip {

    void play(){
        ParkTrip parkTrip = new ParkTrip();
        parkTrip.skip1();
//        parkTrip.skip2(); //NO COMPILA
//        parkTrip.skip3(); //NO COMPILA por la restriccion de package priivate
        skip3(); //Por herencia
    }

}
