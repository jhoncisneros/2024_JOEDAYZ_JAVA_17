package zoo.tours.agency;

import dinos.zoo.tours.api.*;

public class TourImpl implements Tour {
    
    public String name(){
        return "JoeDayz";        
    }

    public int length(){
        return 120;
    }

    public Souvenir getSouvenir(){
        return new Souvenir("stuffed animal");
    }

}
