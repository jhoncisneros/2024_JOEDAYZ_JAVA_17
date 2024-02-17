package pe.joedayz.samples;

public interface Converter {

    long round(double num);
}

class MainConverter {

    public static void main(String[] args) {
        Converter methodRef = Math::round;
        Converter lambda = x -> Math.round(x);

        System.out.println(methodRef.round(100.1));
        System.out.println(lambda.round(100.1));
    }
}
