package org.example;

public class AnimalsOutForAWalk  extends RuntimeException {

}

class ExhibitClosed extends RuntimeException {

}

class ExhibitClosedForLunch extends ExhibitClosed {

}

class Main2 {

    public static void main(String[] args) {
        new Main2().visitPorcupine();
    }

    public void visitPorcupine(){
        try{
            seeAnimal();
            System.out.println("ingreso a try");
        }catch (ExhibitClosed e){
            System.out.println("AnimalsOutForAWalk");
//        }catch (ExhibitClosedForLunch e){ //NO COMPILA
        }catch (AnimalsOutForAWalk e){
            System.out.println("ExhibitClosed");
        }
    }

    private void seeAnimal(){
        throw new ExhibitClosedForLunch();
    }

    public void visitManatees(){
        try {

        }catch (NumberFormatException e1){
            System.out.println(e1);
        }catch (IllegalArgumentException e2){
//            System.out.println(e1); //NO COMPILA
        }
    }


}

