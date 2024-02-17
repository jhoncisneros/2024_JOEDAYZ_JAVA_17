package org.example.topico;

import java.io.FileNotFoundException;
import java.io.IOException;

public class StuckTurkeyCage implements AutoCloseable{

    public void close() throws IOException{
        throw new FileNotFoundException("Cage not closed");
    }

    public static void main(String[] args) throws Exception{
        try (StuckTurkeyCage t = new StuckTurkeyCage()){
            System.out.println("put turkeys in");
        }catch (Exception e){}
//        finally {}
    }
}
