package org.example;

class Rabbit1 {}

class Rabbit2{
    public Rabbit2(){}
}

class Rabbit3{
    public Rabbit3(boolean b){}
}

class Rabbit4{
    private Rabbit4(){}

//    public static Rabbit4 getInstance(){
//        return new Rabbit4();
//    }
}

public class RabbitsMultiply {

    public static void main(String[] args) {
//        var r4 = new Rabbit4(); //NO COMPILA
//        var r4 = Rabbit4.getInstance();

        var r1 = new Rabbit1();
        var r2 = new Rabbit2();
        var r3 = new Rabbit3(true);

    }
}
