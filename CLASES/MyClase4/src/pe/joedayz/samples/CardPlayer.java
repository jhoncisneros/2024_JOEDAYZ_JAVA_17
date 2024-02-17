package pe.joedayz.samples;

import java.io.*;

class Player{
    Player(){
        System.out.println("p");
    }
}

public class CardPlayer extends Player implements Serializable {

    CardPlayer(){
        System.out.println("c");
    }

    public static void main(String[] args) {
        CardPlayer c1 = new CardPlayer();

        try {
            FileOutputStream fos = new FileOutputStream("play.txt");
            ObjectOutputStream os = new ObjectOutputStream(fos);
            os.writeObject(c1);
            os.close();

            FileInputStream fis = new FileInputStream("play.txt");
            ObjectInputStream is = new ObjectInputStream(fis);
            CardPlayer c2 = (CardPlayer) is.readObject();
            is.close();
        }catch (Exception e){

        }

//        BufferedWriter b1 = new BufferedWriter(new File("f"));
//        BufferedWriter b2 = new BufferedWriter(new FileWriter("f1"));
//        BufferedWriter b3 = new BufferedWriter(new PrintWriter("f2"));
//        BufferedWriter b4 = new BufferedWriter(new BufferedWriter(bw));
    }

}
