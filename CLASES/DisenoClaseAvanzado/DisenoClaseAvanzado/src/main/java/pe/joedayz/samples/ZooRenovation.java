package pe.joedayz.samples;

public interface ZooRenovation {

    public String projectName();

    abstract String status();

    default void printStatus(){
        System.out.println("The " + projectName() + " projett " + status());
    }
}
