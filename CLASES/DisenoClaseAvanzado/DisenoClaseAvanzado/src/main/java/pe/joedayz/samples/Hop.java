package pe.joedayz.samples;

public interface Hop {

    static int getJumpHeight(){
        return 8;
    }
}

class Skip {

    public int skip(){
        return Hop.getJumpHeight();
    }
}

class Bunny implements Hop {

    public void printDetails(){
//        System.out.println(getJumpHeight()); //NO COMPILA
    }
}

class Bunny2 implements Hop {

    public void printDetails(){
        System.out.println(Hop.getJumpHeight());
    }
}