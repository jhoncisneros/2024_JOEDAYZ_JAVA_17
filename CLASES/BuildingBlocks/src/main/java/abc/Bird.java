package abc;

public class Bird {

    {
        System.out.println("1. Rain"); //bloque de inicializacion de instancia
    }

    public Bird(){
        System.out.println("4. Contructor");
    }

    public static void main(String[] args) {
        Bird bird1 = new Bird();

        {
            System.out.println("2. Feathers"); //bloque de inicializacion
        }
    }

    {
        System.out.println("3. Snowy"); //bloque de inicializacion de instancia
    }
}
