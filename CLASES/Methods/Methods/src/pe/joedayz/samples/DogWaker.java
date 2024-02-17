package pe.joedayz.samples;

public class DogWaker {

    public static void walkDog(int start, int... steps){
        System.out.println(steps.length);
    }

    public static void main(String[] args) {
        walkDog(1);
        walkDog(1,2);
        walkDog(1,2,3);
        walkDog(1, new int[]{4,5});

//        walkDog(1, null); //NULLPOINTER EXCEPTION
//        walkDog(); //NO COMPILA
    }
}
