package pe.joedayz.samples;

public class Main {

    public static void main(String[] args) {
        String name = "fluffy";

        String name2 = new String("fluffy");

        String name3 = """
                fluffy""";

        if(name == name3)
            System.out.println("true");
        else
            System.out.println("false");

        System.out.println(1 + 2);
        System.out.println("a" + "b" + 3);
        System.out.println(1 + 2 + "c");
        System.out.println("c" + 1 + 2);
        System.out.println("c" + null);

        int three = 3;
        String four = "4";
        System.out.println(1 + 2 + three + four);

        var s = "1";
        s += "2";
        s += 3;
        System.out.println(s);

        String cadena = "animals";
        System.out.println(cadena.length());
        int[] array = {1,2,3,4,5};
        System.out.println(array.length);

        System.out.println(cadena.charAt(0));
        System.out.println(cadena.charAt(6));
//        System.out.println(cadena.charAt(7)); //ERROR EN TIEMPO DE EJECUCION

        System.out.println(cadena.indexOf('a'));
        System.out.println(cadena.indexOf("al"));

        System.out.println(cadena.indexOf('a', 3));
        System.out.println(cadena.indexOf("al", 5)); //-1 no encontró nada

        System.out.println(cadena.substring(cadena.indexOf('m')));
        System.out.println(cadena.substring(3,4));
        System.out.println(cadena.substring(3,7));

        System.out.println(cadena.substring(3,3)); //empty
//        System.out.println(cadena.substring(3,2)); //ERROR EN TIEMPO DE EJECUCION
//        System.out.println(cadena.substring(3,8)); //ERROR EN TIEMPO DE EJECUCION
        System.out.println(cadena.toUpperCase());
        System.out.println("Abc123".toLowerCase());

        System.out.println("abc".equals("ABC"));
        System.out.println("ABC".equals("ABC"));
        System.out.println("abc".equalsIgnoreCase("ABC"));

        System.out.println(cadena);

        System.out.println("abc".startsWith("a"));
        System.out.println("ABC".startsWith("a"));

        System.out.println("abc".endsWith("c"));
        System.out.println("ABC".endsWith("c"));

        System.out.println("abc".contains("b"));
        System.out.println("abc".contains("B"));

        System.out.println("abcdef".replace('a', 'A'));
        System.out.println("abcdef".replace("a", "A"));
        System.out.println("abcdef".replace("abcde", "A"));

        String text = "\t\u2000     abc\u2000\n";
        System.out.println(text.trim().length()); //10
        System.out.println(text.strip().length()); //3
        System.out.println();

        String text2 = "\t     abc\n";
        System.out.println(text2.stripLeading()); //izquierda
        System.out.println(text2.stripTrailing()); //derecha

        var block = """
                 a
                  b
                 c""";

        var concat = " a\n"
                   + "  b\n"
                   + " c";

        System.out.println(block.length()); //6
        System.out.println(concat.length()); //9

//        System.out.println(block.indent(1));
        System.out.println(block.indent(1).length()); //10
//        System.out.println(concat.indent(-1));
        System.out.println(concat.indent(-1).length()); //7
//        System.out.println(concat.indent(-4));
        System.out.println(concat.indent(-4).length()); //6
//        System.out.println(concat.stripIndent());
        System.out.println(concat.stripIndent().length()); //6

        var str = "1\\t2";
        System.out.println(str);
        System.out.println(str.translateEscapes());

        var str2 = "as\\\\df";
        System.out.println(str2);
        System.out.println(str2.translateEscapes());

        System.out.println(" ".isEmpty()); // false
        System.out.println("".isEmpty());  //true
        System.out.println(" ".isBlank()); //true
        System.out.println("".isBlank()); //true

        var name22 = "Miryan";
        var orderId = 5;

        System.out.println("Hello " + name22 + ", your order " + orderId + " is ready");
        System.out.println(String.format("Hello %s, your order %d is ready", name22, orderId));
        System.out.println("Hello %s, your order %d is ready".formatted(name22, orderId));

        var name33 = "Jens";
        var score = 90.25;
        var total = 100;

        System.out.println("%s%n Score:%f out of %d".formatted(name33, score,total));
//        System.out.println("Food: %d tons".formatted(2.3)); //ERROR POR IllegalFormatConversionException

        var pi = 3.141592655359;
        System.out.format("[%f]", pi);
        System.out.println();
        System.out.format("[%.1f]", pi);
        System.out.println();
        System.out.format("[%12.8f]", pi);
        System.out.println();
        System.out.format("[%012f]", pi);
        System.out.println();
        System.out.format("[%12.2f]", pi);
        System.out.println();
        System.out.format("[%.3f]", pi);
        System.out.println();

        String a = "abc";
        String b = a.toUpperCase();
        b = b.replace("B", "2").replace("C", "3"); //OJO

        System.out.println(a);
        System.out.println(b);

    }
}
