package pe.joedayz.samples;

public interface HasTail {
    public int getTailLenght();
}

interface HasWhiskers {
    public int getNumberOfWhiskers();
}

abstract class HarborSeal implements HasTail, HasWhiskers{

}

class CommonSeal extends HarborSeal{

    @Override
    public int getTailLenght() {
        return 0;
    }

    @Override
    public int getNumberOfWhiskers() {
        return 0;
    }
}

//class Cheetah extends HasTail{} //NO COMPILA

//interface HasFur extends CommonSeal{} //NO COMPILA