package pe.joedayz.samples;

public class Repaso {

//    public void cello(int... nums, String values){}

    public void viola(String values, int... nums){}

    public void flute(String[] values, int... nums){}

    public void oboe(String[] values, int[] nums){}

//    public void bass(String... values, int... nums){}

    final static void rain(){}

//    public final int void snow(){}
//    private void int hail(){}
    static final void sleet(){}
//    void final ice(){}
//    void public slush(){}

    final byte song = 6;

    final void method(){
        System.out.println("desde el padre");
    }

    final int count = 0;
    final StringBuilder name = new StringBuilder("abcdefg");
    static int value;

    public int juggle(boolean b, boolean... b2){
        return b2.length;
    }

    public static void main(String[] args) {
        var repaso = new Repaso();
        repaso.name.append("hij");
        System.out.println(repaso.name);
//        repaso.count = 7; //NO COMPILA

//        repaso.juggle();
        repaso.juggle(true);
        repaso.juggle(true, true);
        repaso.juggle(true, true, true);
//        repaso.juggle(true, {true, true}); //NO COMPILA NO EXISTE
        repaso.juggle(true, new boolean[]{true, true});
        repaso.juggle(true, new boolean[2]);

    }
}

class HijoRepaso extends Repaso{

//    void method() {
//        System.out.println("soy el hijo");
//    }
}
