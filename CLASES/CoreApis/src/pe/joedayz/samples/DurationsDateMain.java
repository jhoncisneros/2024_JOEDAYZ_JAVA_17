package pe.joedayz.samples;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

public class DurationsDateMain {

    public static void main(String[] args) {

        var period1 = Period.ofDays(1);
        System.out.println(period1);
        var period2 = Period.ofMonths(1);
        System.out.println(period2);
        var period3 = Period.ofWeeks(1);
        System.out.println(period3);
        var period44 = Period.ofYears(1);
        System.out.println(period44);

        var daily = Duration.ofDays(1);
        System.out.println(daily);
        var hourly = Duration.ofHours(1);
        System.out.println(hourly);
        var everyMinute = Duration.ofMinutes(1);
        System.out.println(everyMinute);
        var everyTensSeconds = Duration.ofSeconds(1);
        System.out.println(everyTensSeconds);
        var everyMili = Duration.ofMillis(1);
        System.out.println(everyMili);
        var everyNano = Duration.ofNanos(1);
        System.out.println(everyNano);

        var daily2 = Duration.of(1, ChronoUnit.DAYS);
        System.out.println(daily2);

        System.out.println("############################");

        var one = LocalTime.of(5,15);
        var two = LocalTime.of(6,30);
        var date = LocalDate.of(2016,1,20);

        System.out.println(ChronoUnit.HOURS.between(one, two));
        System.out.println(ChronoUnit.MINUTES.between(one, two));
//        System.out.println(ChronoUnit.HOURS.between(one, date)); //ERROR EN TIEMPO DE EJECUCION

        LocalTime time = LocalTime.of(3,12,45);
        System.out.println(time);
        System.out.println(time.truncatedTo(ChronoUnit.MINUTES));

        System.out.println("############################");

        var date2 = LocalDate.of(2022,1,20);
        var time2 = LocalTime.of(6,15);
        var dateTime = LocalDateTime.of(date2, time2);
        var duration = Duration.ofHours(6);
        System.out.println(dateTime.plus(duration));
        System.out.println(time2.plus(duration));
//        System.out.println(date2.plus(duration)); //ERROR EN TIEMPO DE EJECUCIÓN

        var date4 = LocalDate.of(2022,5,25);
        var period4 = Period.ofDays(1);
        var days4 = Duration.ofDays(1);

        System.out.println(date4.plus(period4));
//        System.out.println(date4.plus(days4)); //ERROR EN TIEMPO DE EJECUCION


    }
}
