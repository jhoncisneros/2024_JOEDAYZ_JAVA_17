package pe.joedayz.samples;

public class Crate2 {

    private Object contents;

    public Object lookInCrate2(){
        return contents;
    }

    public void packCrate2(Object contents){
        this.contents = contents;
    }

}
