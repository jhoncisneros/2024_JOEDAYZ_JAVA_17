package pe.joedayz.samples;

public class Toucan {

    public void fly(int[] lenghts){}
    public void fly2(int... lenghts){}

//    public void fly(int... lenghts){}

    String glide(int i, int j){ return "1"; }
    String glide(long i, long j){ return "2"; }
    String glide(Integer i, Integer j){ return "3"; }
    String glide(int... i){ return "4"; }


    public static void main(String[] args) {
        var t = new Toucan();
        t.fly(new int[]{1,2,3});
//        t.fly(1,2,3); //NO COMPILA
//        t.fly(); //NO COMPILA

        t.fly2(new int[]{1,2,3});
        t.fly2(1,2,3);
        t.fly2();

        System.out.println(t.glide(1,2));

    }
}
