package pe.joedayz.samples;

@FunctionalInterface
interface Sprint { //SI ES SAM
    public void sprint(int speed);
}

interface Dash extends Sprint { //SI ES SAM

}

interface Skip extends Sprint { //NO ES SAM
    void skip();
}

interface Sleep { //NO ES SAM
    private void snore() {}
    default int getZzzz(){
        return 1;
    }
}

interface Climb2 { //SI ES SAM
    void reach();
    default void fall(){

    }
    static int getBackup(){
        return 100;
    }
    private static boolean checkHeight(){
        return true;
    }
}


//@FunctionalInterface //NO COMPILA
//interface Dance {
//
//    void moeve();
//    void rest();
//}

public class Tiger implements Sprint{
    @Override
    public void sprint(int speed) {
        System.out.println("Animal is sprinting fast! " + speed);
    }
}
