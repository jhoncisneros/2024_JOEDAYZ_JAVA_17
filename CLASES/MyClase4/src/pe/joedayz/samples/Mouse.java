package pe.joedayz.samples;

public class Mouse {

    static int count = 0;
    final int num = 4;

    static final int MAX_LENGTH = 5;
    int length;

    public void grow(int inches){
        System.out.println(length);
        System.out.println(MAX_LENGTH);
        System.out.println(count);
        System.out.println(num);

        if(length <MAX_LENGTH){
            int newSize = length + inches;
            length = newSize;
        }
//        MAX_LENGTH = 7; //DA ERROR PORQUE ES UN FINAL
//        count = 1;
    }

    public static void main(String[] args) {
//        System.out.println(length); //ERROR SOLO LLAMA STATIC
//        System.out.println(MAX_LENGTH); //OK
//        System.out.println(count); //OK
//        System.out.println(num); //ERROR SOLO LLAMA STATIC

//        Mouse m1 = new Mouse();
//        System.out.println(m1.num);
//        m1.length = 5;
//        System.out.println(m1.MAX_LENGTH);
//        m1.count = 3;
//        System.out.println(m1.count);
//        Mouse m2 = new Mouse();
//        m2.length = 7;
//        System.out.println(m2.MAX_LENGTH);
//        m2.count = 4;
//        System.out.println(m1.count);
//        System.out.println(m2.count);
//        System.out.println(Mouse.MAX_LENGTH);
//        Mouse.count = 7;
//        System.out.println(Mouse.count);

    }
}
