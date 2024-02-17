package pe.joedayz.samples;

public class Logicos {

    public static void main(String[] args) {
        boolean eyesClose = true;
        boolean breathinSlowly = true;

        boolean resting = eyesClose | breathinSlowly;
        boolean asleep = eyesClose & breathinSlowly;
        boolean awake = eyesClose ^ breathinSlowly;

        System.out.println(resting);
        System.out.println(asleep);
        System.out.println(awake);

        int hour = 10;

        boolean zooOpen = true || (--hour < 4);

        System.out.println(zooOpen);
        System.out.println(hour);

//        Duck duck = null;

//        if(duck != null & duck.getAge() < 5){
//            System.out.println("ufff!!!");
//        }

        int rabbit = 6;
        boolean bunny = (rabbit >= 6) || (++rabbit<=7);
        System.out.println(rabbit);
        var a = true;
        boolean b = (boolean) a;
        System.out.println(b);

        byte apples = 5;
        short oranges = 10;

        double bananas = apples + oranges;
        System.out.println(bananas);

//        long ear = 10;
//        int hearing = 2 * ear;

        boolean canine = true, wolf = true;
        int teeth = 20;
        canine = (teeth != 10) ^ (wolf=false);

        System.out.println(canine+", "+teeth+", "+wolf);

    }
}
