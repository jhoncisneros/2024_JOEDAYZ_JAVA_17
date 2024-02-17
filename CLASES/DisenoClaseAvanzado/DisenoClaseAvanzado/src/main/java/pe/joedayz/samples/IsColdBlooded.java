package pe.joedayz.samples;

public interface IsColdBlooded {

    boolean hasScales();

    default double getTemperature(){
        return 10.0;
    }
}

interface IsHotBlooded {
    default double getTemperature(){
        return 8.0;
    }
}

class Snake implements IsColdBlooded {

    @Override
    public boolean hasScales() { //OBLIGATORIO override
        return true;
    }

//    @Override
//    public double getTemperature() { //OPCIONAL override
//        return 12.0;
//    }
}

class Snake2 implements IsColdBlooded, IsHotBlooded {

    @Override
    public boolean hasScales() { //OBLIGATORIO override
        return true;
    }

    @Override
    public double getTemperature() { //OBLIGATORIO override
        return IsColdBlooded.super.getTemperature();
    }
}
