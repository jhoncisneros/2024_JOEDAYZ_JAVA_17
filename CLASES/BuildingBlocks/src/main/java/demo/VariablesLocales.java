package demo;

public class VariablesLocales {

    int edad; //0
    String cadena; //null
    boolean status; // false
    double sueldo; //0.0
    char caracter;//

    public int notValid(){
        int y=10;
        int x;

        int reply =y; //x + y;

        return 0;
    }

    public void findAnswer(boolean check){
        int answer;
        int otherAnsewer;
        int onlyOneBranch;
        if(check){
            onlyOneBranch = 1;
            answer = 1;
        }else{
            answer = 2;
        }
        System.out.println(answer);
//        System.out.println(onlyOneBranch);
    }

    public void checkAnswer(){
        boolean value;
//        findAnswer(-);
    }

    public static void main(String[] args) {
        VariablesLocales app = new VariablesLocales();
        System.out.println(app.edad);
        System.out.println(app.cadena);
        System.out.println(app.status);
        System.out.println(app.sueldo);
        System.out.println(app.caracter);
    }
}
