package pe.joedayz.samples;

public class RepasoCoreApis {

    public static void main(String[] args) {

//        int[][] scores = new int[5][]; //OK
//        Object[][][] cubbies = new Object[3][0][5]; //OK
//        String beans[] = new beans[6]; //NO COMPILA
//        java.util.Date[] dates[] = new java.util.Date[2][];
//        int[][] types = new int[]; //NO COMPILA
//        int[][] java = new int[][]; //NO COMPILA

        var s = "Hello";
        var t = new String(s);
        if ("Hello".equals(s));
            System.out.println("one");
        if (t == s)
            System.out.println("two");
        if (t.intern() == s)
            System.out.println("three");
        if ("Hello" == s)
            System.out.println("four");
        if("Hello".intern() == t)
            System.out.println("five");

        var sb = new StringBuilder();
        sb.append("aaa").insert(1, "bb").insert(4, "ccc");
        System.out.println(sb);

        double one = Math.pow(1,2);
//        int two = Math.round(1.0); //NO COMPILA
//        float three = Math.random();  //NO COMPILA
//        var doubles = new double[] {one, two, three};


        var string = "12345";
        var builder = new StringBuilder("12345");

        System.out.println(builder.charAt(4));
        System.out.println(builder.replace(2,4,"6").charAt(3));
        System.out.println(builder.replace(2,5,"6").charAt(2));
//        System.out.println(string.charAt(5)); //NO COMPILA
//        System.out.println(string.length); //NO COMPILA
        System.out.println(string.replace("123", "1").charAt(2));


    }
}
