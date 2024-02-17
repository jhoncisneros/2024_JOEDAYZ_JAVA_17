package pe.joedayz.samples.InnerClass;

public class Fox {

    private class Den {

    }

    public void goHome(){
        new Den();
    }

    public static void visitedFriend(){
//        new Den();// NO COMPILA PORQUE ESTA DENTRO DE UN STATIC
        new Fox().new Den();
    }
}

class Squirrel {

    public void visitFox() {
//        new Den(); //NO COMPILA PORQUE NO ES INSTANCIA DE FOX Y ADEMAS DEN ES PRIVADO
//        new Fox().new Den(); //NO COMPILA
        new Fox().goHome();
    }
}
