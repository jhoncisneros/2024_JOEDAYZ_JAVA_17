package pe.joedayz.samples;

public class StringBuilderMain {

    public static void main(String[] args) {

        //String es inmutable - 27 instancias
        String alpha0 = "";
        for (char c = 'a'; c <= 'z'; c++){
            alpha0 += c;
        }
        System.out.println(alpha0);

        //StringBuilder es mutable
        StringBuilder alpha = new StringBuilder();
        for (char current = 'a'; current <= 'z'; current++){
            alpha.append(current);
        }
        System.out.println(alpha);

        StringBuilder sb = new StringBuilder("start");
        sb.append("+middle");
        sb.append("+end");

        System.out.println(sb);

        StringBuilder a = new StringBuilder("abc");
        StringBuilder b = a.append("de");
        b = b.append("f").append("g");
//        b.append("f").append("g");
        System.out.println("a="+a);
        System.out.println("b="+b);

        var sb2 = new StringBuilder("animals");
        String sub = sb2.substring(sb2.indexOf("a"), sb2.indexOf("al"));
        int len = sb2.length();
        char ch = sb2.charAt(6);
        System.out.println(sub + " " + len + " " + ch);

        var sb3 = new StringBuilder().append(1).append('c');
        sb3.append("-").append(true);
        System.out.println(sb3);

        var sbinsert = new StringBuilder("animals");
        sbinsert.insert(7, "-");
        sbinsert.insert(0, "-");
        sbinsert.insert(4, "-");
        System.out.println(sbinsert);

        var sbdelete = new StringBuilder("abcdef");
        sbdelete.delete(1, 100);
//        sbdelete.delete(1, 3);
        System.out.println(sbdelete);
//        sbdelete.deleteCharAt(5); // ERROR

        var builder = new StringBuilder("pigeon dirty");
//        builder.replace(3, 6, "sty");
        builder.replace(3, 100, "");
        System.out.println(builder);

        var sbreverse = new StringBuilder("ABC");
        sbreverse.reverse();
        System.out.println(sbreverse);

        var one = new StringBuilder();
        var two = new StringBuilder();
        var three = one.append("a");
        System.out.println(one == two); //false
        System.out.println(one == three); //true

        var x = "Hello World";
        var z = " Hello World".trim();
        System.out.println(x.equals(z)); //true
        System.out.println(x == z); //false

        var name = "a";
        var builder2 = new StringBuilder("a");
//        System.out.println(name == builder2); //NO COMPILA



    }
}
