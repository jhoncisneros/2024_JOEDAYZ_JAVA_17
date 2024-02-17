package pe.joedayz.samples;

public interface EmptyStringCreator {
    String create();
}

interface StringCopier {

    String copy(String value);
}

class MainEmptyString {
    public static void main(String[] args) {

        EmptyStringCreator methodRef = String::new;
        EmptyStringCreator lambda = () -> new String();

        var myString = methodRef.create();
        var myString2 = lambda.create();
        System.out.println(myString.equals("Snake"));
        System.out.println(myString2.equals("Snake"));

        StringCopier methodRef2 = String::new;
        StringCopier lambda2 = x -> new String(x);

        var myString3 = methodRef2.copy("Zebra");
        var myString4 = lambda2.copy("Zebra");
        System.out.println(myString3.equals("Zebra"));
        System.out.println(myString4.equals("Zebra"));
    }
}
