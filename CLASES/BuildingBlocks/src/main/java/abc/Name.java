package abc;

public class Name {

    String first = "Teodoro";
    String last = "Carpio";

    String full = first + " " + last;

    public static void main(String[] args) {
        Name name = new Name();
        System.out.println(name.full);
    }
}
