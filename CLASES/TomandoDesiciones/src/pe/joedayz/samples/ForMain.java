package pe.joedayz.samples;

public class ForMain {

    public static void main(String[] args) {
        int x = 0;

        for(long y = 0, z = 4; x < 5 && y < 10; x++, y++){
            System.out.println(y);
        }
        System.out.println(x);

        String birds = "Jay";
//        for (String bird : birds){  //NO COMPILA
//            System.out.println(bird);
//        }

        String[] slots = new String[3];
//        for (int slot : slots){  //NO COMPILA
//            System.out.println(slot);
//        }


    }
}
