package pe.joedayz.samples.polimorfismo;

class Rodent {}

public class Capybara extends Rodent{

    public static void main(String[] args) {
        Rodent rodent = new Rodent();
//        var capybara = (Capybara) rodent; //CLASS CAST EXEPCTION

        Rodent rodent2 = new Capybara();
        var capybara2 = (Capybara) rodent2;

        if(rodent instanceof Capybara c){
            System.out.println("capybara 1");
        }

        if(rodent2 instanceof Capybara c){
            System.out.println("capybara 2");
        }

    }
}
