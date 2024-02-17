package pe.joedayz.samples;

public class PassingData {

    public static void main(String[] args) {
        int num = 4;
        newNumber(num);
        System.out.println(num);
    }

    private static void newNumber(int num){
        num = 8;
    }
}
