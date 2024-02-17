public class Zoo {

//    var tricky = "Hello"; //NO SE PUEDE USAR EN VARIABLES DE INSTANCIA
    String cadena = "Hello";

    public void whatTypeAmi(){
        var name = "Hello"; // SI SE PUEDE USAR EN VARIABLES LOCALES
        var size = 7;
    }

    public void reassignment(){
        var number = 7;
        number = 4;
//        number = "five"; //NO PUEDES CAMBIAR EL TIPO DE DATO UNA VEZ DEFINIDO
    }

    public void breakingDeclaration(){
        var silly


                = 1;
    }

//    public void doesThisCompíle(boolean check){
//        var question;
//        question = 1;
//        var answer;
//        if(check){
//            answer = 2;
//        }else{
//            answer = 3;
//        }
//
//        System.out.println(answer);
//    }

    public void twoTypes(){
//        int a, var b = 3;
//        var n = null; //NO COMPILA CON NULL
    }

//    public void addition(var a, var b){ //NO SE PUEDE USAR EN PARAMETROS
//        return a + b;
//    }

    public static void main(String[] args) {
//        var n = (String) null; //VALIDO
//        System.out.println(n);
    }
}
