package pe.joedayz.samples;

import java.time.DayOfWeek;
import java.util.*;

public class UnReachableCodeMain {

    public static void main(String[] args) {
        int checkDate = 0;

        while(checkDate<10){
            checkDate++;
            if(checkDate>100){
                break;
//                checkDate++; //NO COMPILA
            }
        }

        int hour = 2;
        switch (hour){
//            case 1: return; hour++; //NO COMPILA
        }

        int minute =1;
        WATCH: while (minute>2){
            if(minute++>2){
                continue WATCH;
//                System.out.println(minute); //NO COMPILA
            }
        }
        Double[][] aa = new Double[0][0];
        Map<String, String> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        Set<String> set = new HashSet<>();
        char[] chars = new char[0];
        Double[] doubles = new Double[0];

        for (Double[] a : aa){
            
        }

        for(String a : list){

        }

        for(String a : set){

        }

        for(char a : chars){

        }

        for(Double a : doubles){

        }

        int count = 0;
        BUNNY: for (int row=1; row<=3; row++)
            RABBIT: for (int col=0; col<3; col++){
                if((col + row) % 2 == 0)
                    break  ;
                count++;
            }

//        System.out.println(count);

        int sing = 8, squawk = 2, notes = 0;
        while (sing > squawk){
            sing--;
            squawk += 2;
            notes += sing + squawk;
//            System.out.println(notes);
        }

//        System.out.println(notes);

//        for (var penguin : new int[2])
//            System.out.println(penguin);
//
//        var ostrich = new Character[3];
//        for (var emu : ostrich)
//            System.out.println(emu);
//
//        List<Integer> parrots = new ArrayList<Integer>();
//        for (var macaw : parrots)
//            System.out.println(macaw);
//
//        final char a = 'A', e = 'E';
//        char grade = 'B';
//        switch (grade){
//            default:
//            case a:
//            case 'B': 'C':System.out.println("great ");
//            case 'D': System.out.println("good"); break;
//            case e:
//            case 'F': System.out.println("not good ");
//        }

//        char[] wolf = {'W', 'e', 'b', 'b', 'y'};
//
//        int q = wolf.length;
//        for ( ; ; ){
//            System.out.println(wolf[--q]);
//            if(q==0) break;
//        }
//LLLLLLLLLLLLL
//        for(int m=wolf.length -1; m>=0; --m)
//            System.out.println(wolf[m]);
//
//        for (int z=0; z<wolf.length; z++)
//            System.out.println(wolf[wolf.length -1 - z]);
//
//        int x = wolf.length -1;
//        for (int j=0; x>=0 && j==0; x--)
//            System.out.println(wolf[x]);

//        final int r = wolf.length;
//        for (int w = r-1; r>-1; w = r-1)
//            System.out.println(wolf[w]);

        int participants = 4, animals = 2, performers = -1;

        while((participants = participants +1) < 10){}
        do{}while (animals++ <=1);
        for ( ; performers<2; performers+=2){}

        System.out.println(participants);
        System.out.println(animals);
        System.out.println(performers);
    }

    
}
