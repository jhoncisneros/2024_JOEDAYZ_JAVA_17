package org.example;

class PapaReptile{

    protected int speed = 10;
}

public class Reptile extends PapaReptile{

}

class Cocodrile extends Reptile{
    protected int speed = 20;

    public int getSpeed() {
        return super.speed;
    }

    public static void main(String[] args) {
        var coc = new Cocodrile();
        System.out.println(coc.getSpeed());
    }
}
