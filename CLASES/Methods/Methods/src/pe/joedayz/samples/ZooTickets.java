package pe.joedayz.samples;

public class ZooTickets {

    public static void main(String[] args) {
        int tickets = 2;
        String guests = "abc";
        addTickets(tickets);
        guests = addGuests(guests);
        System.out.println(tickets+guests);

        int quack = 5;
        Integer quackquack = quack; //Autoboxing
        int quackquackquack = quackquack; //Unboxing

        Short tail = 8; //Autoboxin
        Character p = Character.valueOf('p');
        char paw = p; //Unboxing
        Boolean nose = true; //Autoboxing
        Integer e = Integer.valueOf(9);
        long ears = e; //unboxing, then implicit casting

        Character elephant = null;
//        char badElephant = elephant; //ERROR EN EJECUCION NULLPOINTER
    }

    public static int addTickets(int ticekts){
        ticekts++;
        return ticekts;
    }

    private static String addGuests(String guests) {
        guests+="d";
        return guests;
    }
}
