package pe.joedayz.samples;

public class AlcandeDeVariables {

    public void eat(int piecesOfCheese){
        int bitesOfCheese = 1;
    }

    public void eatIfHungry(boolean hungry){
        if(hungry){
            int bitesOfCheese = 1;
            {
                var teenyBit = true;
                System.out.println(bitesOfCheese);
            }
        }
//        System.out.println(bitesOfCheese); //FUERA DE SCOPE O ALCANCE
//        System.out.println(teenyBit); // FUERA DE SCOPE
    }

    public void eatMore(boolean hungry, int amountOfFood){
        int roomInBelly = 5;
        if(hungry){
            var timeToEat = true;
            while(amountOfFood>0){
                int amountEaten = 2;
                roomInBelly = roomInBelly - amountEaten;
                amountOfFood = amountOfFood - amountEaten;
            }
        }
        System.out.println(amountOfFood);

    }
}
