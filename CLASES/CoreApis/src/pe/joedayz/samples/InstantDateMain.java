package pe.joedayz.samples;

import java.time.*;

public class InstantDateMain {

    public static void main(String[] args) {

        var now = Instant.now();
        var later = Instant.now();
        var duration = Duration.between(now, later);

        System.out.println(now);
        System.out.println(later);
        System.out.println(duration);
        System.out.println(duration.toMillis());

        var date = LocalDate.of(2022,5,25);
        var time = LocalTime.of(11,55,00);
        var zone = ZoneId.of("US/Eastern");
        var zonedDateTime = ZonedDateTime.of(date,time,zone);
        var instant = zonedDateTime.toInstant();

        System.out.println(zonedDateTime);
        System.out.println(instant);

        System.out.println("#####################");

        var date2 = LocalDate.of(2022, Month.MARCH, 13);//segundo fin de semana de marzo
        var time2 = LocalTime.of(1,30);// de 1:59 am pasa a 3:00 am (1 hora mas)
        var zone2 = ZoneId.of("US/Eastern");
        var datetime2 = ZonedDateTime.of(date2, time2, zone2);
        System.out.println(datetime2);
        System.out.println(datetime2.getHour());
        System.out.println(datetime2.getOffset());

        datetime2 = datetime2.plusHours(1);
        System.out.println(datetime2);
        System.out.println(datetime2.getHour());
        System.out.println(datetime2.getOffset());
        System.out.println(datetime2.toInstant());

        System.out.println("#####################");

        var date3 = LocalDate.of(2022, Month.NOVEMBER, 6); //primer fin de semana de noviembnre
        var time3 = LocalTime.of(1,30); // de 1:59 am pasa a 1:am (1 hora menos)
        var zone3 = ZoneId.of("US/Eastern");
        var datetime3 = ZonedDateTime.of(date3, time3, zone3);
        System.out.println(datetime3);
        datetime3 = datetime3.plusHours(1);
        System.out.println(datetime3);
        datetime3 = datetime3.plusHours(1);
        System.out.println(datetime3);
        System.out.println(datetime3.toInstant());

        System.out.println("#####################");

        var date4 = LocalDate.of(2022,Month.MARCH,13); //segundo fin de semana de marzo
        var time4 = LocalTime.of(2,30); // de 1:59 am pasa a 3:00 am (1 hora mas)
        var zone4 = ZoneId.of("US/Eastern");
        var datetime4 = ZonedDateTime.of(date4, time4, zone4);
        System.out.println(datetime4);
        System.out.println(datetime4.toInstant());

    }
}
