package pe.joedayz.samples;

public class ArraysSample {

    public static void walk(int[] ints){
        System.out.println("int[]");
    }

    public static void walk(Integer[] integers){
        System.out.println("Integer[]");
    }

    public static void main(String[] args) {
        walk(new Integer[]{1,2,3});
    }
}
