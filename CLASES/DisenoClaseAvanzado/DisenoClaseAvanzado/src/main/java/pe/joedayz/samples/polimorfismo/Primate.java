package pe.joedayz.samples.polimorfismo;

import pe.joedayz.samples.HasTail;

public class Primate {

    public boolean hasHair(){
        return true;
    }
}

interface HasTail2 {

    boolean isTailStripped();
}

class Lemur extends Primate implements HasTail2 {

    public int age = 10;

    public void play(){};

    @Override
    public boolean isTailStripped() {
        return false;
    }

    public static void main(String[] args) {
        Lemur lemur = new Lemur();
        System.out.println(lemur.age);
        System.out.println(lemur.hasHair());
        System.out.println(lemur.isTailStripped());

        HasTail2 hastTail2 = new Lemur(); //INTERFACE
//        hastTail2.play(); //NO COMPILA
        System.out.println(hastTail2.isTailStripped());

        Primate primate = new Lemur(); //CLASE
        System.out.println(primate.hasHair());
//        primate.play() //NO COMPILA

        Lemur lemur2 = new Lemur();
        Object lemurAsObject = lemur2;
        Primate primate2 = lemur2;

        Lemur lemur3 = (Lemur) primate2;
//        Lemur lemur4 = primate2; //NO COMPILA PORQUE FALTA EL CAST

    }
}
