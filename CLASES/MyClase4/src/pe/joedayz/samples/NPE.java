package pe.joedayz.samples;

class NPE {
    static String s;

    public static void main(String[] args) {
//        System.out.println(s.length());
        new NPE().go();
    }

    void go(){
        go();
    }
}
