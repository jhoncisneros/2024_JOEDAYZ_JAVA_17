package demo;

public class ModificadorFinal {

    public static void main(String[] args) {
        final int y = 10;
//        y = 20; //NO COMPILA
        final Integer z = 10;
//        z = 20; //NO COMPILA
        final int[] favoriteNumbers = new int[10];
        favoriteNumbers[0] = 10;
        favoriteNumbers[1] = 20;
//        favoriteNumbers[0] = 30;
//        favoriteNumbers = null;

        System.out.println(favoriteNumbers[0]);
    }
}
