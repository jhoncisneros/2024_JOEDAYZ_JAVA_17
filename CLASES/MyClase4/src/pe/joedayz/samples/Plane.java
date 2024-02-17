package pe.joedayz.samples;

class Plane {

    static String s = "-";

    public static void main(String[] args) {
        new Plane().s1();
        System.out.println(s);

        try{
            int x = Integer.parseInt("two");
        }catch (ClassCastException e){
            System.out.println("e");
        }catch (IllegalStateException d){
            System.out.println("d");
        }catch (NumberFormatException f){
            System.out.println("f");
        }catch (ExceptionInInitializerError g){
            System.out.println("g");
        }catch (ArrayIndexOutOfBoundsException h){
            System.out.println("h");
        }
    }

    void s1(){
        try{
            s2();
        }catch (Exception e){
            s += "c";
        }
    }

    void s2() throws Exception{
        s3();
        s += "2";
        s3();
        s += "2b";
    }

    void s3() throws Exception{
        throw new Exception();
    }
}
