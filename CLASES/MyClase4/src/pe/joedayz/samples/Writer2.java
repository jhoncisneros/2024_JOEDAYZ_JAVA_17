package pe.joedayz.samples;

import java.io.*;

public class Writer2 {

    public static void main(String[] args) {

        char[] in = new char[50];
        int size = 0;
        try{
            File file = new File("fileWrite2.txt");
            FileWriter fw = new FileWriter(file);
//            fw.write("howdy\nfolks\n");
            PrintWriter pw = new PrintWriter(fw);
            pw.println("howdy");
            pw.println("folks");

            fw.flush();
            fw.close();

            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String data = br.readLine();
            System.out.println(data);
//            size = fr.read(in);
//            System.out.println(size + " ");
//            for (char c: in)
//                System.out.println(c);
            fr.close();
        }catch (IOException e){

        }
    }
}
