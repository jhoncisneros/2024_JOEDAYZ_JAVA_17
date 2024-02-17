package pe.joedayz.samples;

public class Hike {

    public void hike1(){}

    public void hike2(){return;}

    public String hike3(){
        return "";
    }

//    public String hike4(){} //NO COMPILA
//    public hike5(){} //NO COMPILA
//    public String int hike6(){} //NO COMPILA

//    String hike7(int a){ //NO COMPILA
//        if(1<2) return "orange";
//    }
    String hike8(int a){
        if(1<2) return "orange";
        return "apple";
    }
}
