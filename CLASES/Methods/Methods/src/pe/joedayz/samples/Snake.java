package pe.joedayz.samples;

public class Snake {

    public static long hiss = 2;

    public static void main(String[] args) {
        System.out.println(Snake.hiss);

        Snake s = new Snake();
        System.out.println(s.hiss);

        s = null;
        System.out.println(s.hiss);

        System.out.println("##########");

        Snake.hiss = 4;
        Snake snake1 = new Snake();
        Snake snake2 = new Snake();
        snake1.hiss = 6;
        snake2.hiss = 8;
        System.out.println(Snake.hiss);
    }
}
