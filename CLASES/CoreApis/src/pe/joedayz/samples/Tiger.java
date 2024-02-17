package pe.joedayz.samples;

import java.util.Arrays;

public class Tiger {

    String name;

    public static void main(String[] args) {
        Tiger t1 = new Tiger();
        Tiger t2 = new Tiger();
        Tiger t3 = t1;

        System.out.println(t1 == t3); //true
        System.out.println(t1 == t2); //false
        System.out.println(t1.equals(t2)); //false

        var x = "Hello World";
        var y = "Hello World";
        System.out.println(x == y); //true

        var xx = "Hello World";
        var zz = " Hello World".trim();
        System.out.println(xx == zz); //false

        var singleString = "Hello World";
        var concat = "Hello ";
        concat += "World";
        System.out.println(singleString == concat); //false

        var xxx = "Hello World";
        var yyy = new String("Hello World");
        System.out.println(xxx == yyy); //false

        System.out.println("=============");

        var name = "Hello World";
        var name2 = new String("Hello World").intern();
        System.out.println(name == name2); //true

        var first = "rat" + 1;
        var second = "r" + "a" + "t" + "1";
        var third = "r" + "a" + "t" + new String("1");
        System.out.println(first == second); //true
        System.out.println(first == second.intern()); //true
        System.out.println(first == third); //false
        System.out.println(first == third.intern()); //true

        int[] numbers = new int[3];
        int[] numbers2 = new int[]{42, 55, 99};
        int[] numbers3 = {42, 55, 99};
        int[] numAnimals;
        int [] numAnimals2;
        int []numAnimals3;
        int numAnimals4[];
        int numAnimals5 [];

        int[] ids, type;
        int ids2[], type2;

        System.out.println("======================");

        String[] bugs = {"cricket", "beetle", "ladybug"};
        String[] alias = bugs;
        System.out.println(bugs.equals(alias)); //true
        System.out.println(bugs.toString()); //
        System.out.println(alias.toString()); //
        System.out.println(Arrays.toString(bugs));

        System.out.println("======================");

        String[] mammals = {"monkey", "chimp", "donkey"};
        System.out.println(mammals.length);
        System.out.println(mammals[0]);
        System.out.println(mammals[1]);
        System.out.println(mammals[2]);

        System.out.println("======================");

        String[] birds = new String[6];
        System.out.println(birds.length);

        int[] numbersx = new int[10];
        for (int i = 0; i < numbersx.length; i++)
            numbersx[i] = i + 5;
        System.out.println(numbersx);

//        numbersx[10] = 3; //ERROR
//        numbersx[numbersx.length] = 5; //ERROR
//        for(int i = 0; i <= numbersx.length; i++) // ERROR
//            numbersx[i] = i + 5;

    }
}
