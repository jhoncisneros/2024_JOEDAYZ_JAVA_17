package pe.joedayz.samples;

public class DestruccionObjetos {

    public static void main(String[] args) {
        Mouse m1 = new Mouse();
        m1.length = 7;
        Mouse m2 = new Mouse();
        m2.length = 5;
        m1 = m2;
        if(true){
            Mouse m3 = new Mouse();
        }
        Mouse m4 = new Mouse();
    }
}

