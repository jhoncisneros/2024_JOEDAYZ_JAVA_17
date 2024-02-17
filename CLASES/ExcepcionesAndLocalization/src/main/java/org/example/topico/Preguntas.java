package org.example.topico;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class Preguntas {

    public static void main(String[] args) {

        //ERROR POR JERARQUIA DE LOS EXCEPTIONS
//        try {
//            System.out.println( 1 / 0);
//        }catch (RuntimeException e){
//            System.out.println(-1);
//        }catch (ArithmeticException e){
//            System.out.println(0);
//        }finally {
//            System.out.println("done");
//        }

        print(100_102.2);
//        pregunta6();
        pregunta8();
        pregunta9();
    }

    public void whatHappensNext() throws IOException {
        System.out.println("it´s ok");
//        throw new Exception(); //NO COMPILA
//        throw new IllegalArgumentException(); //SI COMPILA
//        throw new java.io.IOException(); //SI COMPILA
        throw new RuntimeException(); //SI COMPILA
    }

    public static void print(double t){
        System.out.println(NumberFormat.getCompactNumberInstance().format(t)); //100 k
        System.out.println(NumberFormat.getCompactNumberInstance(Locale.getDefault(), NumberFormat.Style.SHORT).format(t)); //100 K
        System.out.println(NumberFormat.getCurrencyInstance().format(t)); //S/ 100,102.20
    }

    public static void pregunta6(){
        LocalDate date = LocalDate.parse("2022-04-30", DateTimeFormatter.ISO_LOCAL_DATE_TIME);

        System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth()); //ERROR EN RUNTIME - DateTimeParseException

    }

    public static void tryAgain(String s){
//        try (FileReader r = null, p = new FileReader("") { //debe ir punto y coma (;)
//            System.out.println("X");
//            throw new IllegalArgumentException();
//        } catch (Exception s) { //ya no se puede usar la letra "s"
//            System.out.println("A");
//            throw new FileNotFoundException(); //No se atrapa o patea la Excepcion
//        }finally {
//            System.out.println("0");
//        }
    }

    public static void pregunta8(){
        Locale.setDefault(new Locale("en", "US"));
        var b = ResourceBundle.getBundle("Dolphins");
        System.out.println(b.getString("name")); // "dolphing en" (Dolphins_en.properties)
    }

    public static void pregunta9(){

        String pattern = "#,###,000.0#";
        var message = DoubleStream.of(5.21, 8.49, 1234).mapToObj(v ->
                new DecimalFormat(pattern).format(v))
                .collect(Collectors.joining("><"));

        System.out.println("<" + message + ">"); // <005.21><008.49><1,234.0>
    }
}
