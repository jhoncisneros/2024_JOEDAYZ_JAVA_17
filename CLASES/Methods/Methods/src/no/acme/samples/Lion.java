package no.acme.samples;

public class Lion {

    //variable de instancia
    //instance variable
    int hunger = 4; //default = 0
    String name; // default = null
    double averange; // default = 0.0
    boolean active; // default = false

    public int feedZooAnimals(){
        //variables locales
//        int snack; //variable local que no tiene valor no se puede usar
        int snack = 10;
        if(snack > 4){
            long dinnerTime = snack++;
            hunger--;
        }
        return snack;
    }

    public void zooAnimalCheckup(boolean isWeekend){
        final int rest;
        if(isWeekend) rest = 5;
//        else rest = 20;
//        System.out.println(rest); //NO COMPILA

//        rest = 10; //NO COMPILA POR SER FINAL
        final int[] friends = new int[5];
//        friends = null; //NO COMPILA
        friends[2] = 7;
    }

}
