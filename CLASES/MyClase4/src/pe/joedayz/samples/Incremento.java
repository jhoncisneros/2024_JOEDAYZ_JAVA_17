package pe.joedayz.samples;

public class Incremento {

    public static void main(String[] args) {
//        int parkAttendance = 0;
//        System.out.println(parkAttendance); //0
//        System.out.println(++parkAttendance); //1
//        System.out.println(parkAttendance); //1
//        System.out.println(parkAttendance++); //1
//        System.out.println(parkAttendance); //2

//        String x = "test";
//        System.out.println(x.length());
//
//        String[] xa = new String[3];
//        System.out.println(xa.length);

//        String s = "abc";
//        String sa = new String("abc");

//        String x = "abc";
//        x = x.concat("def");
//
//        String y = x.concat("def").concat("ghi");
//        System.out.println("x =" + x);
//        System.out.println("y =" + y);
//
//        String z = new String("abc");
//        z.concat("def");
//        System.out.println("z = " + z);
//
        StringBuffer sb = new StringBuffer("abc");
        sb.append("def");
        System.out.println("sb = " + sb);

        StringBuilder sb2 = new StringBuilder("abc");
        sb2.append("def").reverse().insert(3, "---");
        System.out.println(sb2);

        String x = "abc";
        x.concat("def");
        System.out.println(x);

        String xa = "airplane";
        System.out.println(xa.charAt(2));

        String xm = "taxi";
        System.out.println(xm.concat("cab"));

        String xc = "library";
        System.out.println(xc + " card");

        String xd = "Atlantic";
        xd += " ocean";
        System.out.println(xd);

        String xo = "oxoxoxoxox";
        System.out.println(xo.replace('x','X'));

        String xx = "abc";
        String yy = xx.concat("def").toUpperCase().replace('C','x');
        System.out.println(yy);
    }
}
