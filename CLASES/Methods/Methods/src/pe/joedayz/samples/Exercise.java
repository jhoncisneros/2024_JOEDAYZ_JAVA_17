package pe.joedayz.samples;

public class Exercise {

    public void bike1(){}

    public final void bike2(){}

    public static final void bike3(){}

    public final static void bike4(){}

    final public void bike7(){}

//    public void final bike5(){} //NO COMPILA

    public void swin(int distance){
        if(distance<=0){
            return;
        }
        System.out.println(distance);
    }
}
