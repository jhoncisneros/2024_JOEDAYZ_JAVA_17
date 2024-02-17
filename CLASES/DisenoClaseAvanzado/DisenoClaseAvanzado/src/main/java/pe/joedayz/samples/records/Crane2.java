package pe.joedayz.samples.records;

interface MyBird {}

public record Crane2(int numberEggs, String name) implements MyBird { //SI DEJA IMPLEMENTAR INTERFACE

    //constructores

    public Crane2{ //CONSTRUCTOR COMPACTO
//        this.numberEggs = numberEggs; //POR DEFAULT IMPLICITO
//        this.name = name; //POR DEFAULT IMPLICITO
        if(numberEggs < 0)
//            throw new Exception(); //NO COMPILA CON EXCEPCION CHECKEADA
            throw new IllegalArgumentException();
        name = name.toUpperCase();
    }

    public Crane2(String firstName, String lastName){ //CONSTRUCTOR SOBRECARGADO
        this(0, firstName + " " + lastName); //THIS() VA EN PRIMERA LINEA
    }

    public Crane2(int numberEggs, String firstName, String lastName){ //CONSTRUCTOR SOBRECARGADO
        this(numberEggs+1, firstName + " " + lastName);
        numberEggs=10;
//        this.numberEggs = numberEggs; //NO COMPILA
    }

//    public Crane2(int numberEggs, String name){ //CONSTRUCTOR CON ARGUMENTOS
//        if(numberEggs < 0)
//            throw new IllegalArgumentException();
//        this.numberEggs = numberEggs;
//        this.name = name;
//    }

    //metodos
    //constantes
}

class CraneMain {

    public static void main(String[] args) {
        var mommy = new Crane2(4, "Cammy");
        System.out.println(mommy.name());
        System.out.println(mommy.numberEggs());

        var mommy2 = new Crane2("Craig", "Cammy");
        System.out.println(mommy2);

        var mommy3 = new Crane2(0,"Craig", "Cammy");
        System.out.println(mommy3);

//        var mommy2 = new Crane2(4); //NO COMPILA
//        var mommy3 = new Crane2("Cammy", 4); //NO COMPILA
//        var mommy2 = new Crane2("Cammy"); //NO COMPILA

        var father = new Crane2(0, "Craig");
        System.out.println(father);

        var copyFather = new Crane2(0, "Craig");
        System.out.println(copyFather);
        System.out.println(father.equals(copyFather));
        System.out.println(father.hashCode() + " =? " + copyFather.hashCode());

        var cousin = new Crane2(3, "Jenny");
        var friend = new Crane2(cousin.numberEggs(), "Janeice");

        System.out.println(cousin.equals(friend));
        System.out.println(cousin.hashCode() + " =? " + friend.hashCode());
    }
}

final record Crane3() {}

//record blueCrane extends Crane2 {} //NO COMPILA, NO HAY HERENCIA DE RECORDS

