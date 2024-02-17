package pe.joedayz.samples;

public interface Herbivore {
    public void eatPlants();
}

interface Omnivore {
    public void eatPlants();
}

interface Omnivore2 {
    public int eatPlants();
}

class Bear implements Herbivore, Omnivore {

    @Override
    public void eatPlants() {
        System.out.println("Eating plants");
    }
}

//class Tiger implements Herbivore, Omnivore2 {} //NO COMPILE
