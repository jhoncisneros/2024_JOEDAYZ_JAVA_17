package org.example.formateandovalores;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DecimalFormatSamples {

    public static void main(String[] args) {

        double d = 1234.567;
        NumberFormat f1 = new DecimalFormat("###,###,###.0");
        System.out.println(f1.format(d)); // String: 1,234.6 //redondea

        double d2 = 1234;
        NumberFormat f2 = new DecimalFormat("###,###,###.0");
        System.out.println(f2.format(d2)); // String: 1,234.0

        NumberFormat f3 = new DecimalFormat("000,000,000.00000");
        System.out.println(f3.format(d)); // String: 000,001,234.56700

        NumberFormat f4 = new DecimalFormat("Your Balance $#,###,###.##");
        System.out.println(f4.format(d)); //String: Your Balance $1,234.57


        System.out.println("***************************");

        LocalDate date = LocalDate.of(2023, Month.FEBRUARY, 28);
        System.out.println(date); // 2023-02-28
        System.out.println(date.getDayOfWeek()); // TUESDAY
        System.out.println(date.getMonth()); // FEBRUARY
        System.out.println(date.getYear()); // 2023
        System.out.println(date.getDayOfYear()); // 59

        LocalTime time = LocalTime.of(21, 45, 35);
        System.out.println(time); // 21:45:35

        LocalDateTime dt = LocalDateTime.of(date, time);
        System.out.println(dt); // 2023-02-28T21:45:35

        //DateTimeFormatter standart
        System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE)); // 2023-02-28
        System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME)); // 21:45:35
        System.out.println(dt.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)); //2023-02-28T21:45:35

        //OJO
//        date.format(DateTimeFormatter.ISO_LOCAL_TIME); // GENERA ERROR TIEMPO EJECUCION: UnsupportedTemporalTypeException
//        time.format(DateTimeFormatter.ISO_LOCAL_DATE); // GENERA ERROR TIEMPO EJECUCION: UnsupportedTemporalTypeException

        System.out.println("***************************");

        //DateTimeFormatter.ofPattern("...")
        var f = DateTimeFormatter.ofPattern("MMMM dd, yyyy 'at' hh:mm");
        System.out.println(dt.format(f)); // febrero 28, 2023 at 09:45

        var formatter1 = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss");
        System.out.println(dt.format(formatter1)); // 02/28/2023 09:45:35

        var formatter2 = DateTimeFormatter.ofPattern("MM_yyyy_-_dd");
        System.out.println(dt.format(formatter2)); // 02_2023_-_28

//        var formatter3 = DateTimeFormatter.ofPattern("h:mm z");
//        System.out.println(dt.format(formatter3)); //ERROR EN TIEMPO DE EJECUCION POR TIME ZONE (Z): DateTimeException

        System.out.println(formatter2.format(dt)); //02_2023_-_28

        var g1 = DateTimeFormatter.ofPattern("MMMM dd', Party''s at' hh:mm");
        System.out.println(dt.format(g1)); // febrero 28, Party's at 09:45

        var g2 = DateTimeFormatter.ofPattern("'System format, hh:mm: 'hh:mm");
        System.out.println(dt.format(g2)); // System format, hh:mm: 09:45

        var g3 = DateTimeFormatter.ofPattern("'NEW! 'yyyy', yay!'");
        System.out.println(dt.format(g3)); // NEW! 2023, yay!

        var g4 = DateTimeFormatter.ofPattern("'Hola joedayz'");
        System.out.println(dt.format(g4)); // Hola joedayz

    }
}
