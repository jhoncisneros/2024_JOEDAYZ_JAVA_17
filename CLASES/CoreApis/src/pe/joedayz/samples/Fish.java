package pe.joedayz.samples;

import java.time.LocalDate;

public class Fish {

    public static void main(String[] args) {
        int numFish = 4;
        String fishType = "tuna";
//        String anotherFish = numFish + 1; //NO COMPILA
//        System.out.println(anotherFish + " " + fishType);
        System.out.println(numFish + " " + 1);

        int one = Math.min(5,3);
        long two = Math.round(5.5);
        double three = Math.floor(6.6);
        var doubles = new double[]{one, two, three};

        var date = LocalDate.of(2022,4,3);
        date.plusDays(2);
//        date.plusHours(3); //NO COMPILA
        System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());

        var numbers = "012345678".indent(1);
        System.out.println(numbers);
        numbers = numbers.stripLeading();
        System.out.println(numbers);
        System.out.println(numbers.substring(1,3));
        System.out.println(numbers.substring(7,7));
        System.out.print(numbers.substring(7));
    }
}
