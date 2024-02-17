package pe.joedayz.samples;

public class VisitAttractions {

    public void walk1(int... steps){
        System.out.println(steps.length);
    }

    public void walk2(int start, int ... steps){}

//    public void walk3(int... steps, int start){} //NO COMPILA

//    public void walk4(int... start, int... steps){} //NO COMPILA

    public static void run(int... steps){
        System.out.println(steps[1]);
    }

    public static void main(String[] args) {
        VisitAttractions visitAttractions = new VisitAttractions();
        int[] data = new int[]{1,2,3};

        visitAttractions.walk1(data);

        visitAttractions.walk1(1,2,3,4,5);

        visitAttractions.walk1();

        run(11,77);

//        run();
    }
}
