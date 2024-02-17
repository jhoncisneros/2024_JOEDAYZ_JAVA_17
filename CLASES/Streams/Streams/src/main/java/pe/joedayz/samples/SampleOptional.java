package pe.joedayz.samples;

public class SampleOptional {

    public static java.util.Optional<Double> average(int... scores){
        if(scores.length == 0)
            return java.util.Optional.empty();
        int sum = 0;
        for (int score : scores)
            sum += score;
        return java.util.Optional.of((double) sum / scores.length);
    }

    public static void main(String[] args) {

        System.out.println(java.util.Optional.empty());
        System.out.println(java.util.Optional.of(95));

        System.out.println(average(90, 100));
        System.out.println(average());

        java.util.Optional<Double> opt = average(90, 100);
        if(opt.isPresent())
            System.out.println(opt.get());

        opt.ifPresent(System.out::println);

        java.util.Optional<Double> opt2 = average();
//        System.out.println(opt2.get()); //EN TIEMPO DE EJECUCION GENERA ERROR "NoSuchElementException"

        Integer value = null;
//        Integer value = 1;
        java.util.Optional opt3 = (value == null) ? java.util.Optional.empty() : java.util.Optional.of(value);
        System.out.println(opt3);

        java.util.Optional opt4 = java.util.Optional.ofNullable(value);
        System.out.println(opt4);

        System.out.println("======================================================");

        java.util.Optional<Double> opta = average();
        System.out.println(opta.orElse(Double.NaN));
        System.out.println(opta.orElseGet(()-> Math.random()));

        java.util.Optional<Double> optb = average();
//        System.out.println(optb.orElseThrow()); //EN EJECUCION ARROJA EXCEPTION NoSuchElementException
//        System.out.println(optb.orElseThrow(() -> new IllegalStateException())); //EN EJECUCION ARROJA EXCEPTION IllegalStateException
//        System.out.println(optb.orElseGet(() -> new IllegalStateException())); //NO COMPILA

        java.util.Optional<Double> optc = average(90, 100);
        System.out.println(optc.orElse(Double.NaN));
        System.out.println(optc.orElseGet(() -> Math.random()));
        System.out.println(optc.orElseThrow());
    }
}
