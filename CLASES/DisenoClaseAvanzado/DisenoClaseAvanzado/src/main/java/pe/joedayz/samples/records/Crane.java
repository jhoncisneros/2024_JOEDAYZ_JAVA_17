package pe.joedayz.samples.records;

public final class Crane {

    private final int numberEggs;
    private final String name;

    public Crane(int numberEggs, String name){
        if(numberEggs >= 0)
            this.numberEggs = numberEggs;
        else
            throw new IllegalArgumentException();
        this.name = name;
    }

    public int getNumberEggs() {
        return numberEggs;
    }

    public String getName() {
        return name;
    }
}

class Poacher {

    public void badActor(){
        var mother = new Crane(5, "Cathy");
//        mother.numberEggs = 100;
        System.out.println(mother.getName());
        System.out.println(mother.getNumberEggs());
    }

    public static void main(String[] args) {
        new Poacher().badActor();
    }
}
