package pe.joedayz.samples.polimorfismo;

class Penguin {

    public int getHeight(){

        return 3;
    }

    public void printInfo(){
        System.out.println(this.getHeight());
    }
}

public class EmperorPenguin extends Penguin{

    public int getHeight(){
        return 8;
    }

    public void printInfo(){
        System.out.println(super.getHeight());
    }

    public static void main(String[] args) {

        new EmperorPenguin().printInfo();
        new Penguin().printInfo();
    }
}
