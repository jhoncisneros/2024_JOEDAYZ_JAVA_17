package pe.joedayz.samples;

public interface StringStart {
    boolean beginningCheck(String prefix);
}

interface StringChecker {
    boolean check();
}

class MainStringStart {

    public static void main(String[] args) {
        var str = "Zoo";
        StringStart methodRef = str::startsWith;
        StringStart lambda = s -> str.startsWith(s);

        System.out.println(methodRef.beginningCheck("A"));
        System.out.println(lambda.beginningCheck("A"));

        var str2 = "";
        StringChecker methodRef2 = str2::isEmpty;
        StringChecker lambda2 = () -> str2.isEmpty();

        System.out.println(methodRef2.check());
        System.out.println(lambda2.check());

        var str3 = "";
        StringChecker lambda3 = () -> str3.startsWith("Zoo");
        System.out.println(lambda3.check());
//        StringChecker methodRef3 = str3::startsWith; //NO COMPILA
//        StringChecker methodRef4 = str3::startsWith("Zoo"); //NO COMPILA
    }
}
