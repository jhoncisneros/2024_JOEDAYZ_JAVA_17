package pe.joedayz.samples;

import java.time.*;

public class DateTimesMain {

    private static void performAnimalEntichment(LocalDate start, LocalDate end, Period period){
        var upTo = start;
        while (upTo.isBefore(end)){
            System.out.println("Dar un nuevo juguete " + upTo);
            upTo = upTo.plus(period);
        }
    }

    public static void main(String[] args) {

        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        System.out.println(ZonedDateTime.now());

        var date1 = LocalDate.of(2022, Month.JANUARY, 20);
        var date2 = LocalDate.of(2022, 1, 30);

        System.out.println(date1);
        System.out.println(date2);

        var time11 = LocalTime.of(22,12);
        var time22 = LocalTime.of(22, 12, 30);
        var time33 = LocalTime.of(22,12,30,200);

        System.out.println(time11);
        System.out.println(time22);
        System.out.println(time33);

        var datetime1 = LocalDateTime.of(2022, Month.JANUARY, 20,6,15,30);
        var datetime2 = LocalDateTime.of(date1, time11);

        System.out.println(datetime1);
        System.out.println(datetime2);
        System.out.println("#############");

        var zone = ZoneId.of("US/Eastern");
        var zoned1 = ZonedDateTime.of(2022, 1, 20,6,15,30,200, zone);
        var zoned2 = ZonedDateTime.of(date1, time11, zone);
        var zoned3 = ZonedDateTime.of(datetime1, zone);

        System.out.println(zone);
        System.out.println(zoned1);
        System.out.println(zoned2);
        System.out.println(zoned3);
        System.out.println("#############");
//        var d = new LocalDate(); //NO COMPILA
//        var d = LocalDate.of(2022, Month.JANUARY, 32); //DateTimeException

        var date = LocalDate.of(2022, Month.JANUARY, 20);
        System.out.println(date);
        date = date.plusDays(2);
        System.out.println(date);
        date = date.plusWeeks(1);
        System.out.println(date);
        date = date.plusMonths(1);
        System.out.println(date);
        date = date.plusYears(5);
        System.out.println(date);
        System.out.println("#############");

        var date100 = LocalDate.of(2024, Month.JANUARY, 20);
        var time100 = LocalTime.of(5,15);
        var datetime100 = LocalDateTime.of(date100, time100);
        System.out.println(datetime100);
        datetime100 = datetime100.minusDays(1);
        System.out.println(datetime100);
        datetime100 = datetime100.minusHours(10);
        System.out.println(datetime100);
        datetime100 = datetime100.minusSeconds(30);
        System.out.println(datetime100);
        var datetime200 = LocalDateTime.of(date100, time100).minusDays(1).minusHours(10).minusSeconds(30);
        System.out.println(datetime200);

        var dateError = LocalDate.of(2024, Month.JANUARY, 20);
//        dateError = dateError.plusMinutes(1); // ERROR NO TIENE PARTE TIME
        System.out.println("#############");

        var start = LocalDate.of(2022,Month.JANUARY,1);
        var end = LocalDate.of(2022, Month.MARCH, 30);

        Period period = Period.ofMonths(1);
//        var wrong = Period.ofYears(1).ofWeeks(1);
        var wrong = Period.ofYears(1);
        wrong = Period.ofWeeks(1);
        performAnimalEntichment(start, end, period);

        System.out.println("#############");

        var date333 = LocalDate.of(2022,1,20);
        var time333 = LocalTime.of(6,15);
        var datetime333 = LocalDateTime.of(date333, time333);
        var period2 = Period.ofMonths(1);

        System.out.println(date333.plus(period2));
        System.out.println(datetime333.plus(period2));
//        System.out.println(time333.plus(period2)); //ERROR EN TIEMPO DE EJECUCIÓN
    }
}
