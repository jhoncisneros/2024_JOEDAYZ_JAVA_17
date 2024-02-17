package pe.joedayz.samples;

public class Gorilla {

    public static int count;

    public int total;
//    public static double average = total/5; //NO COMPILA

    public static void addGorilla(){
        count++;
    }

    public void babyGorilla(){
        count++;
    }

    public void announceBabies(){
        addGorilla();
        babyGorilla();
    }

    public static void announceBabiesToEveryone(){
        addGorilla();
//        babyGorilla();//NO COMPILA
    }

    public static void main(String[] args) {
        System.out.println(count);
        addGorilla();
        System.out.println(count);
        Gorilla gorilla = new Gorilla();
        gorilla.babyGorilla();
        System.out.println(count);
    }

}
