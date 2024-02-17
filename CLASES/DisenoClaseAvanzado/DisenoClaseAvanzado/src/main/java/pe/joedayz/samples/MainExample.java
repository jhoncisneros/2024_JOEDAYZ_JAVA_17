package pe.joedayz.samples;


import java.util.ArrayList;
import java.util.List;

record Iguana(int age){
//    private static final int age = 10; //NO COMPILA POR TENER EL MISMO NOMBRE DEL ARGUMENTO
}

final record Gecko(){}

//abstract record Chameleon(){ //NO COMPILA PORQUE ESTA MARCADO COMO ABSTRACT
//    private static String name;
//}

record BeardedDragon(boolean fun){

    @Override
    public boolean fun(){
        return false;
    }
}

record Newt(long size){

    @Override
    public boolean equals(Object obj){
        return false;
    }

//    public void setSize(long size){
//        this.size = size; //NO COMPILA POR QUE LOS RECORDS SON INMUTABLES
//    }
}

interface CanHop{}

class Frog implements CanHop {

    public static void main(String[] args) {
        var frog = new TurtleFrog(); // Frog, TurtleFrog, CanHop, var
        var frog2 = new BrazilianHornedFrog(); // Frog, BrazilianHornedFrog, CanHop, var
    }
}

class BrazilianHornedFrog extends Frog{}

class TurtleFrog extends Frog{}

class Favorites {

    enum Flavors {
        VANILLA, CHOCOLATE, STRAWBERRY;
        static final Flavors DEFAULT = STRAWBERRY;
    }

    public static void main(String[] args) {
        for(final var e : Flavors.values()){
            System.out.println(e.ordinal()+ " ");
        }
    }
}

sealed class ArmoredAnimal permits Armadillo{
    public ArmoredAnimal(int size){
        System.out.println("A");
    }

    @Override
    public String toString(){
        System.out.println("D");
        return "Strong";
    }

    public static void main(String[] args) {
        var c = new Armadillo(10, null);
        System.out.println(c);
    }
}

final class Armadillo extends ArmoredAnimal{

    @Override
    public String toString(){
        System.out.println("C");
        return "Cute";
    }

    public Armadillo(int size, String name){
        super(size);
        System.out.println("B");
    }
}

interface HasExoskeleton {
    double size = 2.0f;
    abstract int getNumberOfSections();
}

abstract class Insect implements HasExoskeleton{
    abstract int getNumberOfLegs();
}

class Beetle extends Insect{

    @Override
    int getNumberOfLegs(){
        return 6;
    }

    int getNumberOfSections(int count){
        return 1;
    }

    @Override
    public int getNumberOfSections() {
        return 0;
    }
}

abstract interface Herbivore2 {
    int amount = 10;

    public void eatGrass();

    public abstract int chew();
}

abstract class IsAplant implements Herbivore2{

    Object eatGrass(int season){
        return null;
    }
}

interface Aquatic {
    int getNumOfGills(int p);
}

class ClownFish implements Aquatic{

    String getNumOfGills(){
        return "14";
    }

    public int getNumOfGills(int input){
        return 15;
    }

    public static void main(String[] args) {
        System.out.println(new ClownFish().getNumOfGills(-1));
    }
}

class Rabbits {

    private int numRabbits = 0;

    public void multiply(){
        numRabbits *= 6;
    }

    public int getNumberOfRabbits(){
        return numRabbits;
    }
}

abstract class Snake10{}

class Cobra10 extends Snake10{}

class GardenSnake10 extends Cobra10{}

class SnakeHandler10 {
    private Snake10 snakey10;

    public void setSnakey10(Snake10 mySnake10){
        this.snakey10 = mySnake10;
    }

    public static void main(String[] args) {
        new SnakeHandler10().setSnakey10(null); //new Cobra10(), new GardenSnake10(), null
    }
}

interface Walk {

    private static List move(){
        return null;
    }
}

interface Run extends Walk{
    public ArrayList move();
}

class Leopard implements Walk {

    public List move(){
        return null;
    }
}

class Panther implements Run{

    @Override
    public ArrayList move() {
        return null;
    }
}

class Movie {
    private int butter = 5;
    private Movie(){
        System.out.println("A");
    }

    protected class Popcorn {
        private Popcorn(){
            System.out.println("B");
        }
        public static int butter = 10;
        public void startMovie(){
            System.out.println(butter);
        }
    }

    public static void main(String[] args) {
        var movie = new Movie();
        Movie.Popcorn in = new Movie().new Popcorn();
        in.startMovie();
    }
}

public class MainExample {

}
