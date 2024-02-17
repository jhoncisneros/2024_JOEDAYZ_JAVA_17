package pe.joedayz.samples;

import java.io.File;
import java.io.IOException;

class Writer1 {

    public static void main(String[] args) {
        try {
            boolean newFile = false;
            File file = new File("fileWrite1.txt");
            System.out.println(file.exists());
            newFile = file.createNewFile();
            System.out.println(newFile);
            System.out.println(file.exists());
        }catch (IOException e){

        }
    }
}
