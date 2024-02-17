package pe.joedayz.samples.InnerClass;

public class Home {

    private String greeting = "Hi"; //OUTER CLASS

    protected class Room { //INNER CLASS
        public int repeat = 3;

        public void enter(){
            for (int i = 0; i < repeat; i++) {
                greet(greeting);
            }
        }

        private static void greet(String message){
            System.out.println(message);
        }
    }

    public void enterRoom(){ //INSTANCIAR METODO OUTER CLASS
        var room = new Room(); //CREANDO INSTANCIA INNER CLASS
        room.enter();
    }

    public static void main(String[] args) {
        var home = new Home(); //CREANDO INSTANCIA DE OUTER CLASS

//        home.enterRoom(); //OTRA FORMA 1

//        Room room = home.new Room(); //CREANDO INSTANCIA DE INNER CLASS - OTRA FORMA 2
//        room.enter();

        new Home().new Room().enter(); //OTRA FORMA 3
    }
}
